package com.cinema.AplicacaoCinemaDAO;

import java.util.ArrayList;

import com.cinema.AplicacaoCinemaModel.Cliente;

public class ClienteDAO {
	private static ArrayList<Cliente> CLIENTES = new ArrayList<Cliente>();
	
	static {
		CLIENTES.add(new Cliente("adm","","","","","","","","","","","adm","123"));
	
	}
	
	public void adicionar(Cliente u) {
		CLIENTES.add(u);
	}
	
	public ArrayList<Cliente>consultarTodos() {
		return CLIENTES;
	}
	
	public Cliente consultarPorLogin(String login) {
		for(Cliente u : CLIENTES) {
			if(u.getLogin().equals(login)) {
				return u;
			}
		}
		return null;
	}
	

}
