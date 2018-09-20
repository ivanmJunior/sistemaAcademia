package br.com.fitNet.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import br.com.fitNet.model.Endereco;;

public class Aluno extends Pessoa{
	
	private Matricula matricula;
	private Date dataCadastro;
	private Date dataAlteracao;
	
	
	public Aluno(){
	   matricula = new Matricula();
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
}
