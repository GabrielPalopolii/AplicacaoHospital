package com.cinema.AplicacaoCinemaWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.AplicacaoCinema.bussines.ClienteBO;
import com.cinema.AplicacaoCinemaModel.Cliente;


@WebServlet(urlPatterns="/login")
public class ServletLoginCliente extends HttpServlet{

	private static final long serialVersionUID = 120763197275687244L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Cliente cliente = new Cliente(login, senha);
		
		out.println("<html><body>");
		
		
		
		cliente = new ClienteBO().autenticar(cliente);
		
		if(cliente != null) {
			out.println("<h2>Usuário " + cliente.getName() + " autenticado com sucesso.</h2>");
			Cookie cookie = new Cookie("usuario.logado", cliente.getName());
			resp.addCookie(cookie);
		} else {
			out.println("<h2 style=\"color:red;\"> Deu ruim!</h2>");
		}
		
		out.println("<a href=\"index.html\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}
}