package com.aplicacao.hospital.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import com.aplicacao.hospital.bussiness.MedicoBO;
import com.aplicacao.hospital.bussiness.RecepcionistaBO;
import com.aplicacao.hospital.model.entities.Medico;
import com.aplicacao.hospital.model.entities.Recepcionista;


import javax.servlet.http.HttpServletRequest;



@WebServlet(urlPatterns="/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = -1544213967016546858L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		//String cargo = req.getParameter("cargo");

		Medico medico = new Medico(login,senha);
		Recepcionista recepcionista = new Recepcionista(login,senha);

		out.println("<html><body>");
		
		medico = new MedicoBO().autenticar(medico);
		recepcionista = new RecepcionistaBO().autenticar(recepcionista);
		
		if(medico != null) {
			out.println("<fieldset>" + 
					"			<legend><h2>Seja Bem vindo " + medico.getNome() + "</h2>"+ 
					"		</legend>");

			out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
			out.println("		<div id =\"image2\">\r\n" + 
					"<tr><td><a href =\"agenda.jsp\"></td>" + "<td><img id =\"pranc\" src =\"pranc.png\">"+"<a/></td></tr>"+
					"			<img id =\"wallpaper\" src =\"images.jpg\">\r\n" + 
					"<a href =\"cal.jsp\">" + "<img id =\"ag\" src =\"ag.png\">"+"<a/>"+
							"<div id =\"image\">"+
						"			<img id =\"wallpaper\" src =\"images.jpg\">\r\n" + 
						"		</div>");

	

			

			Cookie cookie = new Cookie("usuario.logado", medico.getNome());
			resp.addCookie(cookie);
		} 
		
		else if(recepcionista != null) {
			out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
			out.println( "<h1>Seja Bem vindo"+ recepcionista.getNome()+"</h1>");
			out.println("<form action=\"recepcionista.jsp\" method =\"post\">");
			out.println("<a href =\"cadastroPaciente.jsp\">Cadastrar Paciente</a>\r\n");
			out.println("</div>\r\n" + 
					"				<div id =\"image\">\r\n" + 
					"					<img id =\"wallpaper\" src =\"images.jpg\">\r\n" + 
					"				</div>\r\n" + 
					"");
			
			
			

			


			Cookie cookie = new Cookie("usuario.logado", recepcionista.getNome());
			resp.addCookie(cookie);
		}
		
		else {
			out.println("<h2 style=\"color:red;\"> Usuario Não Cadastrado!</h2>");
		}
		
		
		out.println("<br>");

		out.println("<a href=\"index.jsp\">Voltar para Home</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
	}


		
}
	

	

