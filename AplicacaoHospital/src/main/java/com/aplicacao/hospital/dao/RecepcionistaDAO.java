package com.aplicacao.hospital.dao;

import java.util.ArrayList;

import com.aplicacao.hospital.model.entities.Recepcionista;

public class RecepcionistaDAO {
	private static ArrayList<Recepcionista> Recep = new ArrayList<Recepcionista>();
	
	static {
		Recep.add(new Recepcionista("Ana", "ana", "123"));
		Recep.add(new Recepcionista("Carolina", "carolina", "123"));
		Recep.add(new Recepcionista("Vitor", "vitor", "123"));

	}
	
	public void adicionar(Recepcionista u) {
		Recep.add(u);
	}
	
	public ArrayList<Recepcionista> consultarTodos() {
		return Recep;
	}
	
	public Recepcionista consultarPorLogin(String login) {
		for(Recepcionista u : Recep) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		return null;
	}
	

}
