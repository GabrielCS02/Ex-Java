package br.com.generation.ex03;

public class TestaProduto {
	public static void main(String[]args) {
		//Objeto Câmera 
		
		ProdutoEletronico camera1 = new ProdutoEletronico();
		
		camera1.setMarca("Canon");
		camera1.setModelo("EOS Rebel");
		camera1.setLentes("Lentes Disponíveis");
		camera1.setFlash("Flash disponível em 3 niveis de brilho");
		
		
		System.out.println("Sua Câmera é uma "+camera1.getMarca()+" Modelo "+camera1.getModelo()+" com "+camera1.getLentes()+" e "+camera1.getFlash()+".");
	}
}
