package br.com.fitNet.model;

import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Treino {
	
	private Long id;
	private Instrutor instrutor;
	private Cliente cliente;
	private Modalidade modalidade;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataDoAgendamento;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar dataTreino;
	
	@DateTimeFormat(pattern="hh:mm")
	private Calendar horaInicio;
	
	@DateTimeFormat(pattern="hh:mm")
	private Calendar horaTermino;
	
	private String eliminado;
	private String realizado;
	private String observacao;
	private Acesso acesso;
	
	public Treino(){
		
		this.instrutor = new Instrutor();
		//this.cliente = new Cliente();
		this.modalidade = new Modalidade();
		/*this.acesso = new Acesso();
		this.dataDoAgendamento = new Date();*/
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
	public Calendar getDataTreino() {
		return dataTreino;
	}
	public void setDataTreino(Calendar dataTreino) {
		this.dataTreino = dataTreino;
	}
	public Calendar getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Calendar getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Calendar horaTermino) {
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
