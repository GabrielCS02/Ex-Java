package br.com.generation.ex02;



public class TestaAviao {
	public static void main(String[]args) {
		
		//Objeto Avi�o
		
		Aviao aviao1 = new Aviao();
	
		aviao1.setModelo("Lockheed Martin C130 SH");
		aviao1.setCor("Azul");
		aviao1.setTipomotor("Turbo�lice");
		aviao1.setAlturaMax(250);
		
		
		System.out.println("Seu avi�o � um "+aviao1.getModelo()+" de cor "+aviao1.getCor()+" com um motor "+aviao1.getTipomotor()+" que alcan�a uma altura total de "+aviao1.getAlturaMax()+" Metros");
		
		aviao1.permissao();
	}
}
