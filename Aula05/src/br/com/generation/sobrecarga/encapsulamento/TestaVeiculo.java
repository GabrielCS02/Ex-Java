package br.com.generation.sobrecarga.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {
	public static void main(String[]args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite sua marca de carro favorita: ");
	String marca = scan.next();
	
		Veiculo vc = new Veiculo();
		
		vc.setMarca (marca); //Alterando o atributo marca atrav�s do m�todo setMarca
		
		System.out.println(vc.getMarca());//Recuperando os dados do atributo marca atrav�s do metodo getMarca
				
	scan.close();	
	}
	
}
