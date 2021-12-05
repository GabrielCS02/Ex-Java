package br.com.generation.correcao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int evento, horas, min, seg;
		
		System.out.println("Qual o tempo de duração do seu evento em Segundos: ");
		evento = leia.nextInt();
		
		horas = evento / 3600;
		min = (evento % 3600) / 60;
		seg = (min % 60);
		
		System.out.println("O evento durou " + horas + " horas, " + min + " minutos, " + seg + " segundos.");
		
		leia.close();
		
	}
	
}
