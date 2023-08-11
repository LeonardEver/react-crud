package br.com.fcbank.model;

public class Empresa {
	private int id;
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private float vagas_carro;
	private float vagas_moto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getVagas_carro() {
		return vagas_carro;
	}
	public void setVagas_carro(float vagas_carro) {
		this.vagas_carro = vagas_carro;
	}
	public float getVagas_moto() {
		return vagas_moto;
	}
	public void setVagas_moto(float vagas_moto) {
		this.vagas_moto = vagas_moto;
	}
}
