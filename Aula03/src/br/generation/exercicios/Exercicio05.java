package br.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
				
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número ");
			num = scan.nextInt();
			
			soma += num;
			}while (num != 0 );
			System.out.println("Sua soma é "+ soma);
		
			
				
			scan.close();
		
	}
}
