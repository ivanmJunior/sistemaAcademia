package br.com.fitNet.model;

public class AvaliacaoFisica {

	private double peso;
	private double altura;
	private double iMC;
	private double percentualGordura;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getiMC() {
		return iMC;
	}
	public void setiMC(double iMC) {
		this.iMC = iMC;
	}
	
	public double getPercentualGordura() {
		return percentualGordura;
	}
	public void setPercentualGordura(double percentualGordura) {
		this.percentualGordura = percentualGordura;
	}
}
