package br.com.generation.exercicio.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLoja {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int products;
		
		System.out.println("Quantos produtos temos em estoque? ");
		products = scan.nextInt();
		
		ArrayList<LojaGabriel> loja1 = new ArrayList();
		
		
		
		for(int i = 0; i < products ; i++) {
			String placaVideo,processador,teclado,mouse;
			
			System.out.println("Qual Placa de video temos em estoque? ");
			placaVideo =scan.next();
			
			System.out.println("Qual Processador temos em estoque? ");
			processador =scan.next();
			
			System.out.println("Qual Teclado temos em estoque? ");
			teclado =scan.next();
			
			System.out.println("Qual Mouse temos em estoque? ");
			mouse =scan.next();
			
			loja1.add(new LojaGabriel(products,"4",placaVideo,processador,teclado,mouse));
			
		}
		for(LojaGabriel al : loja1) {
			System.out.println(al);
		} 
	}

}
