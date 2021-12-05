package br.com.generation.exercicios;

public class Cachorro extends Animal implements Animais{
	
	void correr() {
		System.out.println("Este tipo de animal pode correr!");
	}

	@Override
	public void caçar() {
		System.out.println("O Cachorro está caçando...");
		
	}
}
