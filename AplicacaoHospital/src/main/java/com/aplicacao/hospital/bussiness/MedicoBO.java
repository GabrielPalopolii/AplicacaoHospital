package com.aplicacao.hospital.bussiness;

import com.aplicacao.hospital.dao.MedicoDAO;
import com.aplicacao.hospital.model.entities.Medico;

public class MedicoBO {
	

		public Medico autenticar(Medico u) {
			Medico usuario = new MedicoDAO().consultarPorLogin(u.getLogin());
			if(usuario == null) return null;
			if(!usuario.getSenha().equals(u.getSenha())) return null;
			return usuario;
		}
		
		public boolean validarUsuario(Medico u) {
			return u.getNome() != null && 
					u.getLogin() != null && 
					u.getSenha() != null ; 
				 

		}
	}


