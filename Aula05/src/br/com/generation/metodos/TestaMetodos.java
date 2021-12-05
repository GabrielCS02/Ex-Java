package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	
	public static int num1, num2, soma2; // Vari�veis globais, podem passar por todos os metodos
	
	public static void main(String[] args) {
		
		metodo7();
		metodo1();
		System.out.println("M�todo 6 sendo chamado da classe MetodoFora "+MetodoFora.metodo6(num1, num2));
	}
	
	public static void metodo1() {
		System.out.println("Ol�, eu sou o m�todo 1....");
		
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
		System.out.println("Soma feita no m�todo anterior.... "+soma2);
		metodo5(num1,num2);
	}
	public static void metodo5(int n1, int n2) {
		int multiplicacao = n1 * n2;
		System.out.println("Multiplica��o no m�todo 5: "+multiplicacao);
		metodo8(num1,num2);
	}
	public static void metodo7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero 1: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o n�mero 2: ");
		num2 = scan.nextInt();
		
		scan.close();
	}
	public static void metodo8(int n1, int n2) {
		int divisao = n1 / n2;
		System.out.println("Divis�o do m�todo 8: " + divisao);
		
	}
}
