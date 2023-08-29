package br.com.fiap.kh.bean;

import java.io.Serializable;

public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idLote;
	private double qtProducao;
	private Produto produto;
	
	public Lote(double qtProducao, Produto produto) {
		super();
		this.qtProducao = qtProducao;
		this.produto = produto;
	}
	
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	public double getQtProducao() {
		return qtProducao;
	}
	public void setQtProducao(double qtProducao) {
		this.qtProducao = qtProducao;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
