package br.com.fitNet.model;

public class FormaPagamento {
	private int idFormaPagamento;
	private String descricaoFormaPagamento;
	private boolean statusAtiva;
	
	
	public int getIdFormaPagamento() {
		return idFormaPagamento;
	}
	public void setIdFormaPagamento(int idFp) {
		this.idFormaPagamento = idFp;
	}
	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}
	public void setDescricaoFormaPagamento(String descricaoFp) {
		this.descricaoFormaPagamento = descricaoFp;
	}
	public boolean isStatusAtiva() {
		return statusAtiva;
	}
	public void setStatusAtiva(boolean statusAtiva) {
		this.statusAtiva = statusAtiva;
	}
	
}
