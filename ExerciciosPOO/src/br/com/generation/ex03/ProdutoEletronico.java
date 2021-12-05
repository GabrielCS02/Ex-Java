package br.com.generation.ex03;

public class ProdutoEletronico {
		// Atributos do Produto
	
	private String marca;
	private	String modelo;
	private String lentes;
	private	String flash;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getLentes() {
		return lentes;
	}
	public void setLentes(String lentes) {
		this.lentes = lentes;
	}
	public String getFlash() {
		return flash;
	}
	public void setFlash(String flash) {
		this.flash = flash;
	}
	 void foto() {
		 System.out.println("Você tira uma bela foto com vista do horizonte e da praia.");
	 }
	
	
	
}
