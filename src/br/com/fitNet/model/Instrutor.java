package br.com.fitNet.model;

import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.Set;

public class Instrutor extends Funcionario{

	//private Acesso acessoInstrutor;
	
	Set<String> especialidades = new LinkedHashSet<>();
	private Endereco endereco;
	private Acesso acesso;

	
	public Instrutor(){
		this.endereco = new Endereco();
		this.acesso = new Acesso();
		setDataAdmissao(new GregorianCalendar());
		setDataCadastro(new GregorianCalendar());
		setDataAlteracao(new GregorianCalendar());
		setDataNascimento(new GregorianCalendar());
	}
	
	public Set<String> getEspecialidades() {
		return especialidades;
	}


	public void setEspecialidades(Set<String> especialidades) {
		this.especialidades = especialidades;
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
