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
		
		if(media >=6.0) { // Sa�da de verdadeiro ou falso
			System.out.println("\nAprovado"+ "\nM�dia: " + media);
		}else if (media >= 3.0 && media < 6.0) {
			System.out.println("\nRecupera��o: " + "\nM�dia: " +media);
			
		}else {
			System.out.println("\nReprovado" + "\nM�dia: "+ media);
		}
		scan.close();
	}
}
