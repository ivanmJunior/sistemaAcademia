package br.com.fitNet.util;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.fitNet.model.Modalidade;

public class FuncaoConfig {

	private String funcao;
	private String metodo;
	private Set<Modalidade>listaModalidades = new LinkedHashSet<>();
	
	public FuncaoConfig(){
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
	public Set<Modalidade> getListaModalidades() {
		return listaModalidades;
	}
	public void setListaModalidades(Set<Modalidade> listaModalidades) {
		this.listaModalidades = listaModalidades;
	}
}
