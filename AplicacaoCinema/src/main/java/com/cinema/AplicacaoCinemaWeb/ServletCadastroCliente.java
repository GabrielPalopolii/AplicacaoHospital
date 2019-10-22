package com.cinema.AplicacaoCinemaWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.AplicacaoCinema.bussines.ClienteBO;
import com.cinema.AplicacaoCinemaDAO.ClienteDAO;
import com.cinema.AplicacaoCinemaModel.Cliente;


@WebServlet(urlPatterns ="/cadastro")
public class ServletCadastroCliente extends HttpServlet {

	private static final long serialVersionUID = -1636761239527488727L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("name");
		String sobreNome = req.getParameter("lastName");
		String rg = req.getParameter("rg");
		String dataNasc = req.getParameter("birthdate");
		String cpf = req.getParameter("cpf");
		String telefone = req.getParameter("phone");
		String cep = req.getParameter("cep");
		String logradouro = req.getParameter("street");
		String numero = req.getParameter("number");
		String complemento = req.getParameter("complement");
		String estado = req.getParameter("state");
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Cliente cliente = new Cliente(nome,sobreNome,rg,dataNasc,cpf,telefone,cep,logradouro,numero,complemento,estado,login,senha);
		
		
		out.println("<html><body>");
		
		if(new ClienteBO().validarCliente(cliente)) {
			new ClienteDAO().adicionar(cliente);
			out.println("<h2>Usuário " + cliente.getName() + " criado com sucesso.</h2>");
			
		} else {
			out.println("<h2 style=\"color:red;\"> É preciso "
					+ "informar todos os campos do usuário</h2>");
		}
		
		out.println("<a href=\"index.jsp\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
		
	}
}


