package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] dado = new int[10];
		int soma = 0, ct = 0, mn = 0 , media= 0;
		
		for(int i = 0; i<=9; i++) {
			
			System.out.println("Digite os lançamentos do dado:");
			dado[i] = scan.nextInt();
			
			soma +=dado[i];
			media = soma/dado.length;
			
			if(mn<dado[i]) {
				mn +=dado[i];
			}if(mn==dado[i]) {
				ct++;
			}
		}
		System.out.println("O maior lançamento foi: "+mn+", apareceu "+ct+" vezes");
		System.out.println("\nA média dos lançamentos foi: "+media+"\n");
		
		scan.close();
	}
}
