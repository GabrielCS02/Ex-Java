package br.com.generation.interfa;

public class TestaInterface {
	public static void main(String[]args) {
	
		Cachorro meuCachorro = new Cachorro();
		
		meuCachorro.somAnimal();
		meuCachorro.dormir();
	System.out.println();
	Gato meuGato = new Gato();
	
	meuGato.somAnimal();
	meuGato.dormir();
	}
}
