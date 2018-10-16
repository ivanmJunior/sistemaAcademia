package br.com.fitNet.util;

public class Mensagens {

	private String  mensagemSucesso;
	private String  mensagemErro;

	public Mensagens(){
		this.mensagemSucesso = "";
		this.mensagemErro = "";
	}
	
	public String getMensagemSucesso() {
		return mensagemSucesso;
	}

	public void setMensagemSucesso(String mensagem) {
		this.mensagemSucesso = mensagem;
	} 
	
	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagem) {
		this.mensagemErro = mensagem;
	} 
}
