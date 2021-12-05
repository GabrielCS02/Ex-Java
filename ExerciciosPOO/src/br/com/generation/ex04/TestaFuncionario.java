package br.com.generation.ex04;

public class TestaFuncionario {
	public static void main(String[]args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Adriane Almeida Santos");
		funcionario1.setCargo("Supervisora");
		funcionario1.setHorasTrabalhadas(44);
		funcionario1.setSalario(4620.55);
		
		System.out.println("A Funcionária "+funcionario1.getNome()+" é uma "+funcionario1.getCargo()+", trabalha"
				+ " por "+funcionario1.getHorasTrabalhadas()+" horas semanais e tem um salário de R$"+funcionario1.getSalario());
		System.out.println();
		funcionario1.eficiencia();
	}
}
