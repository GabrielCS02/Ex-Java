package br.com.generation.exercicios;

public class Preguica extends Animal implements Animais{
	
	void subir() {
		System.out.println("Este tipo de animal pode subir em �rvores!");
		
		
	}

	@Override
	public void ca�ar() {
		System.out.println("O animal dorme ao inv�s de ca�ar!");
		
	}
}
