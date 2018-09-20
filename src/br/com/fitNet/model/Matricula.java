package br.com.fitNet.model;

import java.util.Date;

public class Matricula {

	private int matricula;
	private int idMatricula;
	private Date dataMatricula;
	private boolean statusMatriculaAtiva;
	private int idUsuario;
	private String nomeUsuario;
	private int idAluno;
	private Contrato contrato;

	public Matricula(){
		contrato = new Contrato();
	}
	
	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}
	
	public Contrato getContrato() {
		return contrato;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public boolean isStatusMatriculaAtiva() {
		return statusMatriculaAtiva;
	}

	public void setStatusMatriculaAtiva(boolean statusMatriculaAtiva) {
		this.statusMatriculaAtiva = statusMatriculaAtiva;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	@Override
	public String toString() {
		return "Matricula [idMatricula=" + idMatricula +  ", data=" + dataMatricula + "]";
	}
	
}
