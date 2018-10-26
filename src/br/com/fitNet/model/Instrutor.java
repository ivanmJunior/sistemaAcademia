package br.com.fitNet.model;

import java.util.GregorianCalendar;

public class Instrutor extends Funcionario{
	
	public Instrutor(){
		setEndereco(new Endereco());
		setAcesso(new Acesso());
		setDataAdmissao(new GregorianCalendar());
		setDataCadastro(new GregorianCalendar());
		setDataAlteracao(new GregorianCalendar());
		setDataNascimento(new GregorianCalendar());
	}
	

	
}
