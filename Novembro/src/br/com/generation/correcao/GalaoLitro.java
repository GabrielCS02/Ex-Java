package br.com.generation.correcao;

import java.util.Scanner;

public class GalaoLitro {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		System.out.println("Digite quantos Gal�es de Gasolina voc� quer: ");
		galoes = leia.nextDouble();
		
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + " Gal�es s�o: "+litros + " Litros.");
		
		leia.close();
	}
	
	
}
