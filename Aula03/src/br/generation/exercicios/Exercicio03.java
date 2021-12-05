package br.generation.exercicios;

import java.util.Scanner;

/* Solicitar a idade de várias pessoas e imprimir:
Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
O programa termina quando idade for = -99. */
public class Exercicio03 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int years = 0, contador21 = 0, contador50 = 0;
		
				
		 while(years !=-99) {
			 
			 System.out.println("Digite sua idade: ");
			 years = scan.nextInt();
			 
			 if(years <21 && years != -99 ) {
				 contador21++;
			 }if(years >50 && years != -99) {
			 contador50++;
		
			 }if(years ==-99) {
				 System.out.println("Fim do Programa!");
			
			 }
		 }
		 System.out.println("\nTotal de pessoas com menos de 21 é "+contador21+ " e pessoas com mais de 50 é " +contador50);
		 
		 scan.close();
	}
}
