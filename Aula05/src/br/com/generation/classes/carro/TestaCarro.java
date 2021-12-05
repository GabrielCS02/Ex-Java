package br.com.generation.classes.carro;

public class TestaCarro {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Instanciar o objeto
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.nome = "Fusca";
		c1.marca = "Volks";
		c1.ano = 1980;
		
		
		
		System.out.println(c1.nome);
		System.out.println(c1.marca);
		System.out.println(c1.ano);
		System.out.println("Velocidade de ignição: "+c1.velocidade);
		c1.acelerar(80);
		System.out.println("Velocidade em Rodovia: "+c1.velocidade);
		c1.freiar(30);
		System.out.println("Velocidade em Bairro: "+c1.velocidade);

	}

}
