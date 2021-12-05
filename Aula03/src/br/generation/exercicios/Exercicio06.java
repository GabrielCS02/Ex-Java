package br.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		int num, media, soma = 0, multi = 0 ;
		
		do {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			if(num %3 == 0 && num !=0){
				multi++;
				
				soma += num;
			}
			
			media = soma /multi;
		

		}
		while(num != 0);
			
		System.out.println("A média dos número digitados é: "+media);
			
	scan.close();
	}
	
}
