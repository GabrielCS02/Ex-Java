package br.com.generation.lacofor;

import java.util.Scanner;

public class ExemploFor02 {
	public static void main(String[]args) throws InterruptedException {
		
		int n = 20;
		int i,soma , vr;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite seu valor: ");
		vr = scan.nextInt();
		
		//(Inicialização; condição; incremento++ ou decremento--)
		
		for( i = vr ,soma = 0; i <= n;i++) {
			System.out.println("Soma: "+soma +" + " +i);
			soma +=   i;
			System.out.println(" = " + soma + "\n");
			Thread.sleep(500);
			
			scan.close();
		}
		
	}
	
}
