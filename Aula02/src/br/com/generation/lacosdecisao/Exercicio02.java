package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[]args) {
	
	Scanner scan = new Scanner(System.in);
	
	int n1, n2,n3;
	
	System.out.println("Digite tr�s n�meros: ");
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	n3 = scan.nextInt();
	
	if(n1 <=n2 && n1<=n3) {
		System.out.println("A 1� ordem crescente: \n" +n1+" , " + n2+" , " + n3);	
	}else if(n1 <=n3 && n3<=n2) {
		System.out.println("A 2� ordem crescente: \n" +n1+" , " + n3+" , " + n2);	
	}else if(n2 <=n1 && n1 <=n3) {
		System.out.println("A 3� ordem crescente: \n" +n2+" , " + n1+" , " + n3);	
	}else if(n2 <= n3 && n3 <=n1) {
		System.out.println("A 4� ordem crescente: \n" +n2 +" , "+ n3+" , " + n1);	
	}else if(n3 <= n1 && n3 <=n2) {
		System.out.println("A 5� ordem crescente: \n" +n3+" , "+ n1+" , "+n2);	
	}else {
		System.out.println("A 6� ordem crescente: \n" +n3+" , "+n2+" , "+n1);	
	}
	scan.close();
	
	}
}