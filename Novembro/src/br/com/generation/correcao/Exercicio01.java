package br.com.generation.correcao;

	import java.util.Scanner;

	public class Exercicio01 {

		public static void main(String[] args) {
			
			
			Scanner leia = new Scanner(System.in);
			
			int anos, meses, dias;
			int diasAnos, diasMeses, total;
			
			diasAnos = 365;
			diasMeses = 30;
			
			System.out.println("Digite sua idade em...");
			System.out.println("Anos: ");
			anos = leia.nextInt();
			
			System.out.println("Meses");
			meses = leia.nextInt();
			
			System.out.println("Dias");
			dias = leia.nextInt();
			
			diasAnos *= anos;
			
			diasMeses *= meses;
			
			total = (diasAnos) + (diasMeses) + dias;
			
			System.out.println("Voc� est� vivo faz " + total + " dias!");
			
			leia.close();
					
		

		}

	}
	
	
