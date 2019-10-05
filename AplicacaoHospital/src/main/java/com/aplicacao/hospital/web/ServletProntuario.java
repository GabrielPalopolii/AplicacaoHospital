package com.aplicacao.hospital.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aplicacao.hospital.dao.PacienteDAO;
import com.aplicacao.hospital.model.entities.Paciente;

@WebServlet(urlPatterns ="/prontuario")
public class ServletProntuario extends HttpServlet {

	private static final long serialVersionUID = -8307825795554146886L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	

	
	out.println("<html><body>");
	
	

		out.println("<h2>Pacientes </h2>");
		out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"");
		out.println("<br>");
		out.println("<hr>");
		out.println("<table border =\"1\">");
		out.println("<tr><td>Paciente</td><td>ID</td></tr>");
		ArrayList<Paciente> pacienteList = new PacienteDAO().consultarTodos();
		for(Paciente p: pacienteList) {
			p.getNome();
			p.getcpf();
			p.getTel();
			out.println("<tr><td><a href =\"prontuario.jsp\">" + p.getNome()+"</a></td>"+"<td>" + p.getcpf()+"<td>"+ p.getTel());				
		}
		out.println("</table>");
			
	out.println("<a href=\"index.jsp\">Voltar</a>");
	out.println("</body></html>");
	out.flush();
	out.close();
	
	}

}








