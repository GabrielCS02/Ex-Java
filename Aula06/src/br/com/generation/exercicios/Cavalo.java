package br.com.generation.exercicios;

public class Cavalo extends Animal implements Animais{
	
	void correr() {
		System.out.println("Este tipo de animal pode correr!");
	}

	@Override
	public void ca�ar() {
			System.out.println("Este animal n�o ca�a!");		
	}
}
