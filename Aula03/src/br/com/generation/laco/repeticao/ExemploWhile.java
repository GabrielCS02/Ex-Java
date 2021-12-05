package br.com.generation.laco.repeticao;

public class ExemploWhile {
	// Laço de repetição --> Enquanto
	public static void main(String[]args) throws InterruptedException {
		
		int contador = 0;
		
		while(contador <=10) {
			System.out.println("Repetição: "+ contador);
			contador++;
			Thread.sleep(500);// 500 seria equivalente a meio segundo
		}
	}
}
