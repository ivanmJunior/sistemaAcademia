package br.com.fitNet.model;

import java.util.GregorianCalendar;

public class Nutricionista extends Funcionario{
	
	public Nutricionista(){
		setEndereco(new Endereco());
		setAcesso(new Acesso());
		setDataAdmissao(new GregorianCalendar());
		setDataCadastro(new GregorianCalendar());
		setDataAlteracao(new GregorianCalendar());
		setDataNascimento(new GregorianCalendar());
	}
	
}
