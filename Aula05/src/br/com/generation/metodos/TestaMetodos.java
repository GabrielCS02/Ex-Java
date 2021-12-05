package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	public static int num1, num2, soma2; // Variáveis globais, podem passar por todos os metodos
	
	public static void main(String[] args) {
		
		metodo7();
		metodo1();
		System.out.println("Método 6 sendo chamado da classe MetodoFora "+MetodoFora.metodo6(num1, num2));
	}
	
	public static void metodo1() {
		System.out.println("Olá, eu sou o método 1....");
		
		metodo2();
	}
	public static void metodo2() {
		double  soma, numero1 = 200.0, numero2= 100.0;
		soma = numero1 +numero2;
		System.out.println("Filme muito bom: " +soma);
		
		metodo3();
	}
	
	
	public static void metodo3() {
		soma2 = num1 + num2;    
		metodo4();
	}
	
	public static void metodo4() {
		System.out.println("Soma feita no método anterior.... "+soma2);
		metodo5(num1,num2);
	}
	public static void metodo5(int n1, int n2) {
		int multiplicacao = n1 * n2;
		System.out.println("Multiplicação no método 5: "+multiplicacao);
		metodo8(num1,num2);
	}
	public static void metodo7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número 1: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o número 2: ");
		num2 = scan.nextInt();
		
		scan.close();
	}
	public static void metodo8(int n1, int n2) {
		int divisao = n1 / n2;
		System.out.println("Divisão do método 8: " + divisao);
		
	}
}
