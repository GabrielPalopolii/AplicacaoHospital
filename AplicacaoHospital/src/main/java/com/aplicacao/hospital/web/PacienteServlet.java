package com.aplicacao.hospital.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aplicacao.hospital.bussiness.PacienteBO;
import com.aplicacao.hospital.dao.PacienteDAO;
import com.aplicacao.hospital.model.entities.Paciente;
import java.util.ArrayList;




@WebServlet(urlPatterns="/cadastroPaciente")

public class PacienteServlet extends HttpServlet {

	private static final long serialVersionUID = 4083341011092700585L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String dtNasc = req.getParameter("dt".toString());
		String tel = req.getParameter("tel");

	
		

		
		
		Paciente paciente = new Paciente(nome,cpf,dtNasc,tel);

		
		out.println("<html><body>");
		
		
		
		if(new PacienteBO().validarUsuario(paciente)) {
			new PacienteDAO().adicionar(paciente);
			out.println("<h2>Pacientes </h2>");
			out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
					"");
			out.println("<h2>Pacientes </h2>");
			out.println("<br>");
			out.println("<hr>");
			out.println("<table border =\"1\">");
			out.println("<tr><td>Paciente</td><td>ID</td></tr>");
			ArrayList<Paciente> pacienteList = new PacienteDAO().consultarTodos();
			for(Paciente p: pacienteList) {
				p.getNome();
				p.getcpf();
				out.println("<tr><td>" + p.getNome()+"</td>"+"<td>" + p.getcpf());				
			}
			out.println("</table>");
				
		out.println("<a href=\"index.jsp\">Voltar</a>");
		out.println("</body></html>");
		out.flush();
		out.close();
		
		}
	}
}




