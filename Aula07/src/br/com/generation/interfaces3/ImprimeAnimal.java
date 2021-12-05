package br.com.generation.interfaces3;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Trigre());
		
	//	t.fazerAnimalComer(new Animal());

	}

}
