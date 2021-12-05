package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, soma;
		
		System.out.println("Digite o valor de A: ");
			a = leia.nextDouble();
		
			System.out.println("Digite o valor de B: ");
			b = leia.nextDouble();
			
			soma = a+b;
			
			System.out.println("A soma de A com B é: "+soma);
			
			leia.close();
	}
	
	
	
}
