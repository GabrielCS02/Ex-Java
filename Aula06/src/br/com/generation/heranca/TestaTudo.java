package br.com.generation.heranca;

public class TestaTudo {

	public static void main(String[] args) {

		Professor prof1 = new Professor();
		
		prof1.setNome("Adelvan");
		prof1.setIdade(21);
		prof1.setEndereco("Rua das macieiras, 321");
		prof1.setDisciplina("Biologia");
		prof1.setSalario(2300.00);
		
		System.out.println("Nome: "+prof1.getNome());
		System.out.println("Idade: "+prof1.getIdade());
		System.out.println("Endere�o: "+prof1.getEndereco());
		System.out.println("Disciplina: "+prof1.getDisciplina());
		System.out.println("Sal�rio: R$"+prof1.getSalario());
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Marc�o");
		a1.setIdade(17);
		a1.setEndereco("Avenida dos Aviadores, 77");
		a1.setCurso("Desenvolvimento de Software");
		a1.setSemestre("3� Semestre");
		
		System.out.println();
		
		Professor prof2 = new Professor();
		
		prof2.setNome("Carlin");
		prof2.setIdade(25);
		prof2.setEndereco("Rua das laranjeiras, 334");
		prof2.setDisciplina("Quimica");
		prof2.setSalario(1900.00);
		
		System.out.println("Nome: "+prof2.getNome());
		System.out.println("Idade: "+prof2.getIdade());
		System.out.println("Endere�o: "+prof2.getEndereco());
		System.out.println("Disciplina: "+prof2.getDisciplina());
		System.out.println("Sal�rio: R$"+prof2.getSalario());
		
		System.out.println();
		
		System.out.println("Nome do Aluno: "+a1.getNome());
		System.out.println("Idade do Aluno: "+a1.getIdade());
		System.out.println("Endere�o do Aluno: "+a1.getEndereco());
		System.out.println("Cursando: "+a1.getCurso());
		System.out.println("Periodo do Curso: "+a1.getSemestre());
	}

}
