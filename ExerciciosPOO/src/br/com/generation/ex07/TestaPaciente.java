package br.com.generation.ex07;

public class TestaPaciente {
	public static void main(String[]args) {
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setNome("Carlos Alberto de Nobrega");
		paciente1.setEstadoFisico("joelho e ombro fraturados");
		paciente1.setEstadoMental("leve tontura e sinais de náusea");
		paciente1.setTempoCirurgia(4);
		
		System.out.println("O Paciente "+paciente1.getNome()+" está com o "+paciente1.getEstadoFisico()+""
				+ " e por conta da queda com "+paciente1.getEstadoMental()+". Por conta disso, vai ficar "+paciente1.getTempoCirurgia()+" Horas em cirurgía.");
		
		paciente1.uti();
	}
}
