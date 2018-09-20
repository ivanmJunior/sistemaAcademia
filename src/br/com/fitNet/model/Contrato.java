package br.com.fitNet.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Contrato {
	
	private int idContrato;
	private String tipo;// Receberá "Plano ou Mensalista diacordo com a seleção no cadastro do Aluno.
	private double valor;
	private Date Vencimento;
	private int vencimentoEmDias;
	private double descontoEspecial;
	public Set<String> listaModAluno = new LinkedHashSet<>();
	
	public Set<String> getListaModAluno() {
		return listaModAluno;
	}

	public Contrato(){};
	
	public Contrato(int idContrato){
		this.idContrato = idContrato;
	}
	
	public int getVencimentoEmDias() {
		return vencimentoEmDias;
	}

	public void setVencimentoEmDias(int vencimentoEmDias) {
		this.vencimentoEmDias = vencimentoEmDias;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getVencimento() {
		return Vencimento;
	}
	public void setVencimento(Date vencimento) {
		Vencimento = vencimento;
	}
	
	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public double getDescontoEspecial() {
		return descontoEspecial;
	}

	public void setDescontoEspecial(double descontoEspecial) {
		this.descontoEspecial = descontoEspecial;
	}

	public void setListaModAluno(Set<String> listaModAluno) {
		this.listaModAluno = listaModAluno;
	}

	@Override
	public String toString() {
		return "Contrato " + listaModAluno + "\n";
		
	}

}
