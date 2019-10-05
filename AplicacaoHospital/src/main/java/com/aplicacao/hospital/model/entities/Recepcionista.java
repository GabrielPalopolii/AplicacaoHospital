package com.aplicacao.hospital.model.entities;

public class Recepcionista {

	private String nome;
	private String login;
	private String senha;
//	private String cargo;

	public Recepcionista(String login, String senha/*,String cargo*/) {
		this.login = login;
		this.senha = senha;
	//	this.cargo = cargo;
	}
	
	public Recepcionista(String nome, String login, String senha/*,String cargo*/) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		//this.cargo = cargo;
	
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	*/

	

}
