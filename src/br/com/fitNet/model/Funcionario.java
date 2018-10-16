package br.com.fitNet.model;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public abstract class Funcionario extends Pessoa{
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAdmissao;
	
	@NumberFormat(pattern="###0,00")
	private double salario;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAlteracao;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataCadastro;
	
	private Long ctps;
	private String funcao;
	private String nivel;
	private String observacao;
	private boolean statusAtivo;
	
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Long getCtps() {
		return ctps;
	}
	public void setCtps(Long ctps) {
		this.ctps = ctps;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public boolean isStatusAtivo() {
		return statusAtivo;
	}
	public void setStatusAtivo(boolean statusAtivo) {
		this.statusAtivo = statusAtivo;
	}

	
}
