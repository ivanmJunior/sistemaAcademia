package br.com.fitNet.model;

import java.util.ArrayList;

public class FichaTreino {

	public ArrayList<Treino>listaDeTreino;

	public FichaTreino(){
		
		listaDeTreino = new ArrayList<>();
	}
	
	public ArrayList<Treino> getListaDeTreino() {
		return listaDeTreino;
	}

	public void setListaDeTreino(ArrayList<Treino> listaDeTreino) {
		this.listaDeTreino = listaDeTreino;
	}
}
