package br.com.generation.condicional;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[]args) {
		
	Scanner scan = new Scanner(System.in);
	
	double n1,n2,media;
	
	System.out.println("Digite sua primeira nota: ");
		n1 = scan.nextDouble();
				
	System.out.println("Digite sua segunda nota: ");
		n2 = scan.nextDouble();
		
		media = (n1+n2) / 2;
		
		if(media >=6.0) { // Saída de verdadeiro ou falso
			System.out.println("\nAprovado"+ "\nMédia: " + media);
		}else if (media >= 3.0 && media < 6.0) {
			System.out.println("\nRecuperação: " + "\nMédia: " +media);
			
		}else {
			System.out.println("\nReprovado" + "\nMédia: "+ media);
		}
		scan.close();
	}
}
