package br.com.generation.teste.software;

import java.util.Scanner;

public class TesteUnitario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com dois numero: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		Calculadora calc = new Calculadora();
		
		double resultadoEsperado = 4;
		double resultado = calc.soma(num1, num2);
			
		if(resultado == resultadoEsperado) {
			System.out.println("Teste OK");
		}
		else {
			System.out.println("Teste Falhou");
		}
			
	}

}
