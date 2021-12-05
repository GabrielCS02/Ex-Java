package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[]notas =  new double[5];
		double  mp = 0.0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a "+(i+1)+"º pontuação do aluno: ");
			notas[i] = scan.nextDouble();
			
			if(notas[i] >= mp) {
				mp = notas[i];
				
			}
		}
		for(int i = 0; i <4; i++) {
			System.out.println("A "+(i+1)+"º pontuação do aluno foi: "+notas[i]);
		}
		
		System.out.println("A maior pontuação foi: "+mp);
		
		scan.close();
	}
}
