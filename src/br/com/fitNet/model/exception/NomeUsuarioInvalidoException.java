package br.com.fitNet.model.exception;

public class NomeUsuarioInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NomeUsuarioInvalidoException(String mensagem){
		super(mensagem);
	}
}
