package br.com.generation.exercicios;

public class TestaTudo {

	public static void main(String[] args) {
		
		
		
		Cachorro dog = new Cachorro();
		
		
		Cavalo cavalo = new Cavalo();
		
		
		Preguica preg = new Preguica();
		

		
		dog.setNome("Pastor alem�o");
		dog.setIdade(5);
		
		
		cavalo.setNome("Puro Sangue");
		cavalo.setIdade(12);

		preg.setNome("Bicho Pregui�a");
		preg.setIdade(7);
		
		// Mostra dados do cachorro.
		System.out.println("Nome: " + dog.getNome() + "\nIdade: " + dog.getIdade());
		dog.emitirSom();
		dog.ca�ar();
		dog.correr();
		System.out.println("================================");
		
		// Mostra dados do cavalo.
		System.out.println("\nNome: " + cavalo.getNome() + "\nIdade: " + cavalo.getIdade());
		cavalo.emitirSom();
		cavalo.ca�ar();
		cavalo.correr();
		System.out.println("================================");
		
		// Mostra dados da pregui�a.
		System.out.println("\nNome: " + preg.getNome() + "\nIdade: " + preg.getIdade());
		preg.emitirSom();
		preg.ca�ar();
		preg.subir();
		System.out.println("================================");

	}

}