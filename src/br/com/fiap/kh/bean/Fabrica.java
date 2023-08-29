package br.com.fiap.kh.bean;

import java.io.Serializable;

public class Fabrica implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idFabrica;
	private String nome;
	private String endereco;
	
	public Fabrica(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public int getIdFabrica() {
		return idFabrica;
	}
	public void setIdFabrica(int idFabrica) {
		this.idFabrica = idFabrica;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
