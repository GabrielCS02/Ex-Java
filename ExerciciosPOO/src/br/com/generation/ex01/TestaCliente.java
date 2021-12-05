package br.com.generation.ex01;



public class TestaCliente {
	public static void main(String[]args) {
		
		//Objeto Cliente
		
		
		
		
		
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Adelvan Santos");
		cliente1.setSexo("Masculino");
		cliente1.setIdade(25);
		cliente1.setEstadoCivil("Casado");
		cliente1.setFilhos(14);
		
		
		System.out.println("\nO/A Cliente "+ cliente1.getNome() +" se identifica como sexo "+cliente1.getSexo()+", possui "+cliente1.getIdade()+" anos e é "+cliente1.getEstadoCivil()+" com "+cliente1.getFilhos()+" filhos.");
		
		cliente1.acordo();
		
		
	}
	
}
