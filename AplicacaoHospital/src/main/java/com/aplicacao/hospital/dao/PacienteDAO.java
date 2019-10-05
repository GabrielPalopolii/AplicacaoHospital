package com.aplicacao.hospital.dao;

import java.util.ArrayList;

import com.aplicacao.hospital.model.entities.Paciente;

public class PacienteDAO {
	private static ArrayList<Paciente> PACIENTE = new ArrayList<Paciente>();
	
	static {
		PACIENTE.add(new Paciente("Gabriel", "46320442883","24/03/2000","45784940"));
		PACIENTE.add(new Paciente("Joao", "123456789","04/09/1970","45784940"));
		PACIENTE.add(new Paciente("Paulo", "999999999","02/03/1999","45784940"));
		PACIENTE.add(new Paciente("Vitor", "66666666666","04/2/2001","45784940"));
		PACIENTE.add(new Paciente("Antonio", "1111111","31/06/1990","45784940"));
		

		
		
	}
	
	public void adicionar(Paciente u) {
		PACIENTE.add(u);
	}
	
	public ArrayList<Paciente>consultarTodos() {
		return PACIENTE;
	}
	
	public Paciente consultarPorLogin(String nome) {
		for(Paciente u : PACIENTE) {
			if(u.getNome().equals(nome)) {
				return u;
			}
		}
		return null;
	}
	

}
