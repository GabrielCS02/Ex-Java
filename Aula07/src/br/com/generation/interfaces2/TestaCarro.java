package br.com.generation.interfaces2;

public class TestaCarro {

	public static void main(String[] args) {
		
		
		Lamborghini c = new Lamborghini();
		c.nacionalidade = "Itália"; // --> Atributo da classe nação
		c.acelerar(); // --> Metodo de interface Carro
		
		Brasilia d = new Brasilia();
		d.nacionalidade = "Brasil";
		d.acelerar();
	}

}
