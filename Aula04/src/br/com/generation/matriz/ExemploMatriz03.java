package br.com.generation.matriz;

import java.util.Scanner;

public class ExemploMatriz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[][] notasA = new double[2][4];
		
		System.out.println("===Notas do Aluno===");
		
		//Adicionando valores na Matriz
		for(int l = 0; l < notasA.length;l++) {
			for(int c = 0; c < notasA[l].length; c++) {
				System.out.printf("Digite às notas: %d | %d:", l, c);
				notasA[l][c] = scan.nextDouble();
				
			}
			System.out.println();
		}
		//Imprimindo os valores da Matriz
		for(int l = 0; l < notasA.length;l++) {
			for(int c = 0; c < notasA[l].length; c++) {
				System.out.print(notasA[l][c] + "|");
				
			}
			System.out.println();
		}
		scan.close();
	}

}
