package br.com.generation.ex05;

public class Patinete {
	// Atributos do Patinete
	
	private String marca;
	private String material;
	private double pesoMax;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}
	
	void queda(){
		System.out.println("Você bate de frente com uma pedra no caminho, quebra seu patinete e vai parar no hospital com  17 costelas quebradas....");
	}
}
