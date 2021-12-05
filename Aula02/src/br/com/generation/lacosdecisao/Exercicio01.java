package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2,n3;
		
		System.out.println("Digite o primeiro número inteiro: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		n2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
		n3 = scan.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior número é: "+n1);
		}if(n2>n1 && n2>n3) {
			System.out.println("O maior número é: "+n2);
		}if(n3>n1 && n3>n2) {
			System.out.println("O maior número é: "+n3);
		}else {
			System.out.println("Digite um valor válido");
		}
			
		scan.close();
		
	} 
}
