package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] val = new int[3][3];
		int somaval = 0, somadiag = 0;
		int soma = 0;
		
		for(int l = 0; l <val.length; l++) {
			for(int c = 0 ; c < val[l].length;c++) {
				System.out.printf("Digite os valores "
						+ "necessários na posição -->: [%d][%d] --> ",l,c);
					val[l][c] = scan.nextInt();
				
				somaval += val[l][c];
				if(l == c) {
					somadiag += val[l][c];
					
					
			}
		}
	}
		soma = val[0][0] + val [1][1] + val[2][2];
		
		
		System.out.println("...A soma da matriz:..."+somaval);
		System.out.println("\nA soma da  Diagonal: "+somadiag);

		System.out.println("...Verificação: "+ soma);
		
		scan.close();
	}

}
