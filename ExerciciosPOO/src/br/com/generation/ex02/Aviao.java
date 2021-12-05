package br.com.generation.ex02;

public class Aviao {
	//Atributos do avião
	private String modelo;
	private String cor;
	private String tipomotor;
	private double alturaMax;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipomotor() {
		return tipomotor;
	}
	public void setTipomotor(String tipomotor) {
		this.tipomotor = tipomotor;
	}
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	void permissao() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Seu Avião está apto a entrar no espaço aéreo Brasileiro.");
	}
	
}
