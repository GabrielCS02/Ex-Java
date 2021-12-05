package br.com.generation.construtor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String outronome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int outraidade = scan.nextInt();
		
		Pessoa objeto = new Pessoa(outronome, outraidade);
		
		System.out.println(objeto.nome);
		System.out.println(objeto.idade);
		
		scan.close();
	}
	

}
