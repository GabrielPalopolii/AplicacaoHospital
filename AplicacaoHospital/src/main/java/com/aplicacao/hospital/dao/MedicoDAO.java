package com.aplicacao.hospital.dao;

import java.util.ArrayList;

import com.aplicacao.hospital.model.entities.Medico;

public class MedicoDAO {
	private static ArrayList<Medico> USUARIOS = new ArrayList<Medico>();
	
	static {
		USUARIOS.add(new Medico("Andrey", "andrey", "123"));
		USUARIOS.add(new Medico("Roberto", "roberto", "123"));
		USUARIOS.add(new Medico("Lucas", "lucas", "123"));

	}
	
	public void adicionar(Medico u) {
		USUARIOS.add(u);
	}
	
	public ArrayList<Medico>consultarTodos() {
		return USUARIOS;
	}
	
	public Medico consultarPorLogin(String login) {
		for(Medico u : USUARIOS) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		return null;
	}
	

}
