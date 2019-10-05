package com.aplicacao.hospital.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aplicacao.hospital.bussiness.MedicoBO;
import com.aplicacao.hospital.bussiness.RecepcionistaBO;
import com.aplicacao.hospital.dao.MedicoDAO;
import com.aplicacao.hospital.dao.RecepcionistaDAO;
import com.aplicacao.hospital.model.entities.Medico;
import com.aplicacao.hospital.model.entities.Recepcionista;


@WebServlet(urlPatterns="/funcionario")

public class ServletFuncionario extends HttpServlet {
	private static final long serialVersionUID = 196033607546486874L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String login = req.getParameter("user");
		String senha = req.getParameter("pwd");
		//String cargo = req.getParameter("cargo").toString();

		Medico medico = new Medico(nome, login, senha);//,cargo);
		Recepcionista recepcionista = new Recepcionista(nome, login, senha);//,cargo);

		
		out.println("<html><body>");
		
		if(/*cargo =="medico" &&*/ new MedicoBO().validarUsuario(medico)) {
			new MedicoDAO().adicionar(medico);
			out.println("<h2>Usuário " + medico.getNome() + " criado com sucesso.</h2>");
		}

		
		else if(/*cargo =="recepcionista" &&*/ new RecepcionistaBO().validarUsuario(recepcionista)) {
			new RecepcionistaDAO().adicionar(recepcionista);
			out.println("<h2>Usuário " + recepcionista.getNome() + " criado com sucesso.</h2>");
			
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


