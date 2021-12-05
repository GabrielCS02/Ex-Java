package br.com.generation.sobrecarga.metodos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora mc = new MinhaCalculadora();
		
		System.out.println("Soma: "+ mc.soma(5.5, 10.9));
		System.out.println("Soma: "+mc.soma(10,8.5, 6));
	}

}
