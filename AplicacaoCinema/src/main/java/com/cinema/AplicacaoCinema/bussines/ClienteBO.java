package com.cinema.AplicacaoCinema.bussines;

import com.cinema.AplicacaoCinemaDAO.ClienteDAO;
import com.cinema.AplicacaoCinemaModel.Cliente;

public class ClienteBO {

	public Cliente autenticar(Cliente u) {
		Cliente cliente = new ClienteDAO().consultarPorLogin(u.getLogin());
		if(cliente == null) return null;
		if(!cliente.getSenha().equals(u.getSenha())) return null;
		return cliente;
	}
	
	public boolean validarCliente(Cliente u) {
		return u.getName() != null && 
				u.getLogin() != null && 
				u.getSenha() != null ; 
			 
	
	}
}
