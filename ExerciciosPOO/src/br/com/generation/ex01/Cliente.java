package br.com.generation.ex01;

public class Cliente {
	 // Atributos do cliente
	private String nome ;
	private String sexo;
	private int idade;
	private int filhos;
	private String estadoCivil;
	


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public int getFilhos() {
			return filhos;
		}

		public void setFilhos(int filhos) {
			this.filhos = filhos;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		void acordo() {
			System.out.println("\n=======================================================================================================");
			System.out.println("\nO cliente está de acordo com todas as informações acima.");
		}
	
}
