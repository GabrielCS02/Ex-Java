package br.com.generation.interfaces2;

public class TestaCarro {

	public static void main(String[] args) {
		
		
		Lamborghini c = new Lamborghini();
		c.nacionalidade = "It�lia"; // --> Atributo da classe na��o
		c.acelerar(); // --> Metodo de interface Carro
		
		Brasilia d = new Brasilia();
		d.nacionalidade = "Brasil";
		d.acelerar();
	}

}
