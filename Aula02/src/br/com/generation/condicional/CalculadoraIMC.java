package br.com.generation.condicional;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		double imc, pesoKG = 0.0, alturaM = 0.0;
		
		System.out.println("Digite seu peso atual: ");
		pesoKG = scan.nextDouble();
		
		System.out.println("Digite sua altura: ");
		alturaM = scan.nextDouble();
		
		imc = pesoKG / (alturaM * alturaM);
		
		System.out.println("\nValores do IMC");
		
		System.out.println("Abaixo do peso: Menos que 18,5.");
		System.out.println("Normal: Entre 18,5 e 24,9.");
		System.out.println("Sobrepeso: Entre 25,0 e 29,9.");
		System.out.println("Obeso: Acima de 30,0.");
		System.out.println("\nSeu IMC é: "+imc);
		
		if(imc <18.5) {
			System.out.println("Você está abaixo do peso! Favor comer bastante!");
		}if(imc > 18.5 && imc < 24.9 ) {
			System.out.println("Você está com peso ideal! Continue assim...");
		}if(imc > 25.0 && imc< 29.9) {
			System.out.println("Você está acima do peso ideal! Favor entrar na academia.");
		}if(imc > 29.0) {
			System.out.println("Você está Obeso! Favor ir ao médico.");
		}
		scan.close();
	}
}
