package br.com.fitNet.model;

import java.util.Date;

public class Modalidade {

	//private static int IDMODALIDADE = 1;
	private int idModalidade;
	private String descricao;
	private double valorPlano;
	private double valorMensalista;
	private double descontoMensalista;
	private double descontoPlano;
	private boolean statusModalidade;
	private Date dataCadastro;
	private String observacao;
	private Acesso acesso;
	private int idAcesso;
	private Date dataAlteracao;
	private boolean modalidadeEliminada;
	
	public boolean isModalidadeEliminada() {
		return modalidadeEliminada;
	}

	public void setModalidadeEliminada(boolean modalidadeEliminada) {
		this.modalidadeEliminada = modalidadeEliminada;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public int getIdAcesso() {
		return idAcesso;
	}

	public void setIdAcesso(int idAcesso) {
		this.idAcesso = idAcesso;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public Modalidade(){
		//this.idModalidade = IDMODALIDADE++; Usado na versão em BD
		this.dataCadastro = new Date();
	}
	
	public int getIdModalidade() {
		return idModalidade;
	}
	public void setIdModalidade(int idModalidade) {
		this.idModalidade = idModalidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valorPlano;
	}
	public void setValor(double valor) {
		this.valorPlano = valor;
	}

	public boolean isStatusModalidade() {
		return statusModalidade;
	}

	public void setStatus(boolean status) {
		this.statusModalidade = status;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public double getValorPlano() {
		return valorPlano;
	}

	public void setValorPlano(double valorPlano) {
		this.valorPlano = valorPlano;
	}

	public double getValorMensalista() {
		return valorMensalista;
	}

	public void setValorMensalista(double valorMensalista) {
		this.valorMensalista = valorMensalista;
	}

	public double getDescontoMensalista() {
		return descontoMensalista;
	}

	public void setDescontoMensalista(double descontoMensalista) {
		this.descontoMensalista = descontoMensalista;
	}

	public double getDescontoPlano() {
		return descontoPlano;
	}

	public void setDescontoPlano(double descontoPlano) {
		this.descontoPlano = descontoPlano;
	}

	public String getObservacao() {
		return observacao;
	}

	/*public static int getIDMODALIDADE() {
		return IDMODALIDADE;
	}*/

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Modalidade: " + idModalidade + " - " + descricao + " - Valor R$ " + valorPlano;
	}
	
	
}
