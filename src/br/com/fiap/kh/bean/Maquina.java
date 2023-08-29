package br.com.fiap.kh.bean;

import java.io.Serializable;

public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idMaquina;
	private String nome;
	private int fabrica;
	
	public Maquina(String nome, int fabrica) {
		super();
		this.nome = nome;
		this.fabrica = fabrica;
	}
	
	public int getIdMaquina() {
		return idMaquina;
	}
	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFabrica() {
		return fabrica;
	}
	public void setFabrica(int fabrica) {
		this.fabrica = fabrica;
	}
}
