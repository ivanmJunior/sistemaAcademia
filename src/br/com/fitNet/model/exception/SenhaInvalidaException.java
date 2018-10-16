package br.com.fitNet.model.exception;

public class SenhaInvalidaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SenhaInvalidaException(String mensagem){
		super(mensagem);
	}
}
