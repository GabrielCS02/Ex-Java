package br.generation.exercicios;

import java.util.Scanner;

// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
public class Exercicio02 {
	public static void main(String[]args) {
		
		Scanner scan= new Scanner(System.in);
		
		int num , i , par = 0, imp = 0;
		
		for( i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + "� n�mero");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par++;// contador de n�meros pares
				}
			if(num % 2 ==1) {
				imp++; // contador de n�meros impares
			}
			scan.close() ;
			
		}
		System.out.println("Total de "+par+ " N�meros pares e "+imp+ " N�meros impares." );
		
		
		
	}
}
