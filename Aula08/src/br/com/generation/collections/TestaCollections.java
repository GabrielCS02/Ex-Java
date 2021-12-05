package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {

		String aula1 = "Bloco I - Java";
		String aula2 = "Bloco II - Back-end - SpringBoot";
		String aula3 = "Bloco III - Front-end"; 
		String aula4 = "Bloco IV - Java Mobile";
		
		ArrayList<String> aulas = new ArrayList();
		aulas.add(aula1); // --> Posição 0
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		//System.out.println(aulas);
		//aulas.remove(3);
		//System.out.println(aulas);
		
		// --> For - each
	/*	for(String i : aulas) {
			System.out.println("aulas: "+i);
		}*/
		
	//	String primeiraAula = aulas.get(1);
		
	//	System.out.println("A primeira aula é: "+ primeiraAula);
		
		/*for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula "+(i+1)+" : "+ aulas.get(i));	
		}
		System.out.println(aulas.size());*/
		
		Collections.sort(aulas); //coloca a lista na ordem crescente, sendo número ou letras...
		
		System.out.println(aulas);
		
	}

}
