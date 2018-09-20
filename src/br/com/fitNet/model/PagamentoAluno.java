package br.com.fitNet.model;

import java.util.Date;

public class PagamentoAluno {
	private int idPagamento;
	private Aluno aluno;
	private double totalJuros;
	private double totalDesconto;
	private double valorPago;
	private double subTotal;
	private Date dataPagamento;
	private int diasEmAtraso;
	private FormaPagamento formaPagamento;
	
	
	public int getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public double getTotalJuros() {
		return totalJuros;
	}
	public void setTotalJuros(double totalJuros) {
		this.totalJuros = totalJuros;
	}
	public double getTotalDesconto() {
		return totalDesconto;
	}
	public void setTotalDesconto(double totalDesconto) {
		this.totalDesconto = totalDesconto;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public int getDiasEmAtraso() {
		return diasEmAtraso;
	}
	public void setDiasEmAtraso(int diasEmAtrazo) {
		this.diasEmAtraso = diasEmAtrazo;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
