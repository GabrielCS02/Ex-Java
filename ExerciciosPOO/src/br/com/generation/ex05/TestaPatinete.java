package br.com.generation.ex05;

public class TestaPatinete {
	public static void main(String[]args) {
		
		Patinete patinete1 = new Patinete();
		
		patinete1.setMarca("Caloi");
		patinete1.setMaterial("Metal Fundido");
		patinete1.setPesoMax(120);
		
		System.out.println("O Patinete é da marca "+patinete1.getMarca()+". Forjado com base em "
				+ ""+patinete1.getMaterial()+" e suporta um total de "+patinete1.getPesoMax()+"KG.");
		
	}
}
