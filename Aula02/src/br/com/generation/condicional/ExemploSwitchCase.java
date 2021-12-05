package br.com.generation.condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Escreva uma letra entre A e D");
		String letra = scan.next();
		
		switch(letra) {
		case "a", "A" :
			System.out.println("Anny");
		break;
		case "b", "B":
			System.out.println("Brand");
		break;
		case "c", "C":
			System.out.println("Carlin");
		break;
		case "d", "D":
			System.out.println("Daenerys");
		break;
		default:
			System.out.println("Opção Inválida!");
		}
		scan.close();
	}
}
