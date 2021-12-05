package br.com.generation.exercicios;

public class Preguica extends Animal implements Animais{
	
	void subir() {
		System.out.println("Este tipo de animal pode subir em árvores!");
		
		
	}

	@Override
	public void caçar() {
		System.out.println("O animal dorme ao invés de caçar!");
		
	}
}
