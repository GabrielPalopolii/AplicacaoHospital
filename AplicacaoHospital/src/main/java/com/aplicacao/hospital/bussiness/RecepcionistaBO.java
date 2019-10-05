package com.aplicacao.hospital.bussiness;

import com.aplicacao.hospital.dao.RecepcionistaDAO;
import com.aplicacao.hospital.model.entities.Recepcionista;

public class RecepcionistaBO {
	

		public Recepcionista autenticar(Recepcionista u) {
			Recepcionista usuario = new RecepcionistaDAO().consultarPorLogin(u.getLogin());
			if(usuario == null) return null;
			if(!usuario.getSenha().equals(u.getSenha())) return null;
			return usuario;
		}
		
		public boolean validarUsuario(Recepcionista u) {
			return u.getNome() != null && 
					u.getLogin() != null && 
					u.getSenha() != null;
		}
	}


