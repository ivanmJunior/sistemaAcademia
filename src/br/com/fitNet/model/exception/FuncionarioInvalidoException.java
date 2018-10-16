package br.com.fitNet.model.exception;

public class FuncionarioInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FuncionarioInvalidoException(String mensagem){
		super(mensagem);
	}
}
