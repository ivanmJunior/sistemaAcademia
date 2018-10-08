package br.com.fitNet.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Modalidade {
	
	private int idModalidade;
	private String descricao;
	private double valor;
	private boolean statusAtivo;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataCadastro;
	
	private String observacao;
	private Acesso acesso;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAlteracao;
	
	private String eliminada;

	
	public Modalidade(){

		this.dataCadastro = new GregorianCalendar();
		this.dataAlteracao = new GregorianCalendar();
		this.acesso = new Acesso();
		this.eliminada = "N";
	}
	
	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
	
	public int getIdModalidade() {
		return idModalidade;
	}
	public void setIdModalidade(int idModalidade) {
		this.idModalidade = idModalidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getEliminada() {
		return eliminada;
	}

	public void setEliminada(String eliminada) {
		this.eliminada = eliminada;
	}


	public boolean isStatusAtivo() {
		return statusAtivo;
	}

	public void setStatusAtivo(boolean statusAtivo) {
		this.statusAtivo = statusAtivo;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@Override
	public String toString() {
		return "Modalidade: " + idModalidade + " - " + descricao + " - Valor R$ " + valor;
	}
	
	
}
