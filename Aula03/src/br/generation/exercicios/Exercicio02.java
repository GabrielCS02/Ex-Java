package br.generation.exercicios;

import java.util.Scanner;

// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
public class Exercicio02 {
	public static void main(String[]args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num , i , par = 0, imp = 0;
		
		for( i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;// contador de números pares
				}
			if(num % 2 ==1) {
				imp++; // contador de números impares
			}
			scan.close() ;
			
		}
		System.out.println("Total de "+par+ " Números pares e "+imp+ " Números impares." );
		
		
		
	}
}
