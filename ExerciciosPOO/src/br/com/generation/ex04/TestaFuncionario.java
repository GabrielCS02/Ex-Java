package br.com.generation.ex04;

public class TestaFuncionario {
	public static void main(String[]args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Adriane Almeida Santos");
		funcionario1.setCargo("Supervisora");
		funcionario1.setHorasTrabalhadas(44);
		funcionario1.setSalario(4620.55);
		
		System.out.println("A Funcion�ria "+funcionario1.getNome()+" � uma "+funcionario1.getCargo()+", trabalha"
				+ " por "+funcionario1.getHorasTrabalhadas()+" horas semanais e tem um sal�rio de R$"+funcionario1.getSalario());
		System.out.println();
		funcionario1.eficiencia();
	}
}
