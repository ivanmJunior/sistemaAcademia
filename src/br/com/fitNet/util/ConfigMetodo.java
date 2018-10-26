package br.com.fitNet.util;

public class ConfigMetodo {

	private String funcao;
	private String metodo;
	
	public ConfigMetodo(){
		this.funcao = "";
		this.metodo = "";
	}
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

}
