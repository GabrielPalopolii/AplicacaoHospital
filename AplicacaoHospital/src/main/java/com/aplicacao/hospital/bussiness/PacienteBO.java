package com.aplicacao.hospital.bussiness;

import com.aplicacao.hospital.dao.PacienteDAO;
import com.aplicacao.hospital.model.entities.Paciente;

public class PacienteBO {
	

		public Paciente autenticar(Paciente u) {
			Paciente paciente = new PacienteDAO().consultarPorLogin(u.getLogin());
			if(paciente == null) return null;
			if(!paciente.getId().equals(u.getId())) return null;
			return paciente;
		}
		
		public boolean validarUsuario(Paciente u) {
			return u.getNome() != null && 					
					u.getcpf() != null; 
		}
	}


