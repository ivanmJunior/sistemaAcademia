package br.com.fitNet.model;

import java.util.Date;

public class Treino {

	private Long id;
	private Instrutor instrutor;
	private Cliente cliente;
	private Modalidade modalidade;
	private Date dataDoAgendamento;
	private Date dataTreino;
	private Date horaInicio;
	private Date horaTermino;
	private String eliminado;
	private String realizado;
	private String observacao;
	private Acesso acesso;
	
	public Treino(){
		
		this.instrutor = new Instrutor();
		this.cliente = new Cliente();
		this.modalidade = new Modalidade();
		this.acesso = new Acesso();
		this.dataDoAgendamento = new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instrutor getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Date getDataDoAgendamento() {
		return dataDoAgendamento;
	}
	public void setDataDoAgendamento(Date dataDoAgendamento) {
		this.dataDoAgendamento = dataDoAgendamento;
	}
	public Date getDataTreino() {
		return dataTreino;
	}
	public void setDataTreino(Date dataTreino) {
		this.dataTreino = dataTreino;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Date horaTermino) {
		this.horaTermino = horaTermino;
	}
	public String getEliminado() {
		return eliminado;
	}
	public void setEliminado(String eliminado) {
		this.eliminado = eliminado;
	}
	public String getRealizado() {
		return realizado;
	}
	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Acesso getAcesso() {
		return acesso;
	}
	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
	
}
