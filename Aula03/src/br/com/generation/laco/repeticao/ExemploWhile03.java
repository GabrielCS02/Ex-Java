package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class ExemploWhile03 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = -1;
		
		while(n != 0 ) {
			System.out.println("Digite um n�mero: ");
			n= scan.nextInt();
			
			if(n == 0) {
				System.out.println("Final da contagem....");
			}
		}
		scan.close();
	}
}
