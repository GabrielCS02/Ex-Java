package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio02 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos;
		
		System.out.println("Digite sua idade em Dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (meses % 30);
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses, " + dias + " dias.");
		
		leia.close();
	}
	
	
}
