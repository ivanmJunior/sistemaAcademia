package br.com.fitNet.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;


public class Cliente extends Pessoa{
	
	@OneToOne
	private Matricula matricula;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataCadastro;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAlteracao;
	
	private boolean statusAtivo;
	
	public Cliente(){
		this.setDataNascimento(new GregorianCalendar());
		this.dataCadastro = new GregorianCalendar();
		this.dataAlteracao = new GregorianCalendar();
		this.matricula = new Matricula();
		this.setAcesso(new Acesso());
		this.setEndereco(new Endereco());
		
	}

	public Matricula getMatricula() {
		return matricula;
	}


	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
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

	public boolean isStatusAtivo() {
		return statusAtivo;
	}

	public void setStatusAtivo(boolean statusAtivo) {
		this.statusAtivo = statusAtivo;
	}
	
}
