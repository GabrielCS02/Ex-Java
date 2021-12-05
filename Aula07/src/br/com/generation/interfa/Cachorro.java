package br.com.generation.interfa;

public class Cachorro implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("Cachorro latindo: auau");
		
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro......dormindo.....");
		
	}
}
