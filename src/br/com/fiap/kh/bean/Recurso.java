package br.com.fiap.kh.bean;

import java.io.Serializable;

public class Recurso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idRecurso;
	private String nome;
	private double custoUnidade;
	
	public Recurso(String nome, double custoUnidade) {
		super();
		this.nome = nome;
		this.custoUnidade = custoUnidade;
	}
	
	public int getIdRecurso() {
		return idRecurso;
	}
	public void setIdRecurso(int idRecurso) {
		this.idRecurso = idRecurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCustoUnidade() {
		return custoUnidade;
	}
	public void setCustoUnidade(double custoUnidade) {
		this.custoUnidade = custoUnidade;
	}
	
}
