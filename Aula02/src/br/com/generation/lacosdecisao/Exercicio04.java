package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n1, impar,par;
		
		System.out.println("Digite seu número: ");
		n1= scan.nextDouble();
		
		impar =n1* n1;
		
		par = Math.sqrt(n1);
		if(n1 % 2 == 0){
			System.out.println("Seu número é Par e sua raiz quadrada é: "+par);
		}else{
			System.out.println("Seu número é impar e seu valor elevado ao quadrado é "+impar);
		}
		scan.close();
	}
}
