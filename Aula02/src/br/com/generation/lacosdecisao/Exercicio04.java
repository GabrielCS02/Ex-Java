package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n1, impar,par;
		
		System.out.println("Digite seu n�mero: ");
		n1= scan.nextDouble();
		
		impar =n1* n1;
		
		par = Math.sqrt(n1);
		if(n1 % 2 == 0){
			System.out.println("Seu n�mero � Par e sua raiz quadrada �: "+par);
		}else{
			System.out.println("Seu n�mero � impar e seu valor elevado ao quadrado � "+impar);
		}
		scan.close();
	}
}
