package br.com.generation.ex07;

public class Paciente {
	//Atributos de um Paciente
	
	private String nome;
	private String estadoMental;
	private String estadoFisico;
	private int tempoCirurgia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstadoMental() {
		return estadoMental;
	}
	public void setEstadoMental(String estadoMental) {
		this.estadoMental = estadoMental;
	}
	public String getEstadoFisico() {
		return estadoFisico;
	}
	public void setEstadoFisico(String estadoFisico) {
		this.estadoFisico = estadoFisico;
	}
	public int getTempoCirurgia() {
		return tempoCirurgia;
	}
	public void setTempoCirurgia(int tempoCirurgia) {
		this.tempoCirurgia = tempoCirurgia;
	}
	
	void uti() {
		System.out.println("\nO paciente vai ficar na UTI até segunda ordem.....");
	}
}
