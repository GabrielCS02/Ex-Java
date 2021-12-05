package br.com.generation.correcao;

import java.util.Scanner;

public class GalaoLitro {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		System.out.println("Digite quantos Galões de Gasolina você quer: ");
		galoes = leia.nextDouble();
		
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + " Galões são: "+litros + " Litros.");
		
		leia.close();
	}
	
	
}
