package br.com.fitNet.model;

import java.util.Date;

public class Acesso {
	
	private int id;
	private String usuario;
	private String senha;
	private boolean status;
	private boolean eliminado;
	private int idFunionario;
	private Date dataCadastro;
	private Date dataAlteracao;
	public static Acesso USUARIO_LOGADO;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	public int getIdFunionario() {
		return idFunionario;
	}
	public void setIdFunionario(int idFunionario) {
		this.idFunionario = idFunionario;
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

}
