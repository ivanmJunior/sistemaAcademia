package br.com.fitNet.model;

import java.util.GregorianCalendar;

public class Atendente extends Funcionario{
	
	private Endereco endereco;
	private Acesso acesso;
	
	public Atendente(){
		this.endereco = new Endereco();
		this.acesso = new Acesso();
		setDataAdmissao(new GregorianCalendar());
		setDataCadastro(new GregorianCalendar());
		setDataAlteracao(new GregorianCalendar());
		setDataNascimento(new GregorianCalendar());
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
}
