package br.generation.exercicios;

public class Exercicio01 {
	public static void main(String[]args) {
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		int valor = 0;
		for(int i = 1000 ; i < 2000; i++) {
			if(i%11==5) {
				valor++;
				System.out.println("Este é o º" +valor+": " +i);
			}
		}
		
		
	}
}
