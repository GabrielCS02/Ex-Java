package br.com.generation.ex02;



public class TestaAviao {
	public static void main(String[]args) {
		
		//Objeto Avião
		
		Aviao aviao1 = new Aviao();
	
		aviao1.setModelo("Lockheed Martin C130 SH");
		aviao1.setCor("Azul");
		aviao1.setTipomotor("Turboélice");
		aviao1.setAlturaMax(250);
		
		
		System.out.println("Seu avião é um "+aviao1.getModelo()+" de cor "+aviao1.getCor()+" com um motor "+aviao1.getTipomotor()+" que alcança uma altura total de "+aviao1.getAlturaMax()+" Metros");
		
		aviao1.permissao();
	}
}
