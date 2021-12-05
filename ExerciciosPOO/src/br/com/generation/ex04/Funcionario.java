package br.com.generation.ex04;

public class Funcionario {
	// Atributos do Produto
	
		private String nome;
		private	String cargo;
		private double salario;
		private	int horasTrabalhadas;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public int getHorasTrabalhadas() {
			return horasTrabalhadas;
		}
		public void setHorasTrabalhadas(int horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}
	
		void eficiencia() {
			 System.out.println("O funcionário em questão poderia ser um pouco mais eficiente. ");
		 }
			
		
}
