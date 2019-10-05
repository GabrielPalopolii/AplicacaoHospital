package com.aplicacao.hospital.model.entities;

public class Paciente {

	private String nome;
	private String cpf;
	private String historico;
	private String dataNasc;
	private String tel;
	private String id;
	private String login;

	
	public Paciente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Paciente(String nome, String cpf,String dataNasc,String tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.tel = tel;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public void setcpf(String senha) {
		this.cpf = senha;
	}


	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
 
}


