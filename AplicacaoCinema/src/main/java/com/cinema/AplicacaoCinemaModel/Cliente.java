package com.cinema.AplicacaoCinemaModel;
public class Cliente {

	private String name;
	private String lastName;
	private String rg;
	private String birthdate;
	private String cpf;
	private String phone;
	private String cep;
	private String street;
	private String number;
	private String complement;
	private String state;
	private String login;
	private String Senha;
	
	//login
	public Cliente(String login, String senha) {
		this.login = login;
		this.Senha = senha;

	}
	
	//cadastro
	public Cliente(String nome, String vlastName,String vrg, String vbirthdate,String vcpf, String vphone, String vcep, String vstreet, String vnumber, String vcomplement, String vstate,String vlogin, String vsenha) {
		this.name = nome;
		this.lastName = vlastName;
		this.rg = vrg;
		this.birthdate = vbirthdate;
		this.cpf = vcpf;
		this.phone = vphone;
		this.cep = vcep;
		this.street = vstreet;
		this.number = vnumber;
		this.complement = vcomplement;
		this.state = vstate;
		this.login = vlogin;
		this.Senha = vsenha;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
}



	
	