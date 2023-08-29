package br.com.fiap.kh.bean;

import java.io.Serializable;
import java.sql.Date;

public class Consumo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idConsumo;
	private int maquina;
	private double qtRecurso;
	private Date dataInicial;
	private Date dataFinal;
	private Recurso recurso;
	private Lote lote;
	
	public Consumo(int maquina, double qtRecurso, Date dataInicial, Date dataFinal, Recurso recurso, Lote lote) {
		super();
		this.maquina = maquina;
		this.qtRecurso = qtRecurso;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.recurso = recurso;
		this.lote = lote;
	}
	
	public int getIdConsumo() {
		return idConsumo;
	}
	public void setIdConsumo(int idConsumo) {
		this.idConsumo = idConsumo;
	}
	public int getMaquina() {
		return maquina;
	}
	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}
	public double getQtRecurso() {
		return qtRecurso;
	}
	public void setQtRecurso(double qtRecurso) {
		this.qtRecurso = qtRecurso;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Recurso getRecurso() {
		return recurso;
	}
	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}
	public Lote getLote() {
		return lote;
	}
	public void setLote(Lote lote) {
		this.lote = lote;
	}
}
