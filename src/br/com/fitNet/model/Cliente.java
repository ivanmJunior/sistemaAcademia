package br.com.fitNet.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.format.annotation.DateTimeFormat;


public class Cliente extends Pessoa{
	
	private Matricula matricula;
	private Acesso acesso;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataCadastro;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataAlteracao;
	
	private Endereco endereco;
	private boolean statusAtivo;
	
	public Cliente(){
		this.setDataNascimento(new GregorianCalendar());
		this.dataCadastro = new GregorianCalendar();
		this.dataAlteracao = new GregorianCalendar();
		this.matricula = new Matricula();
		this.acesso = new Acesso();
		this.endereco = new Endereco();
		
	}

	public Matricula getMatricula() {
		return matricula;
	}


	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isStatusAtivo() {
		return statusAtivo;
	}

	public void setStatusAtivo(boolean statusAtivo) {
		this.statusAtivo = statusAtivo;
	}
	
}
