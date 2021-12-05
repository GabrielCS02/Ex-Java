package br.com.generation.collections03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		System.out.println("Quantos alunos você quer inserir: ");
		int numeroAlunos = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite o nome do Aluno: ");
			String nome = scan.next();
			scan.nextLine();
			System.out.println("Digite a idade do Aluno: ");
			int idade = scan.nextInt();
			
			alunos.add(new Aluno(nome, idade));
		}
		for(Aluno al : alunos) {
			System.out.println(al);
		}
		scan.close();
	}
	

}
