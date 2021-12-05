package br.com.generation.ex06;

public class ContaBancaria {
		//Atributos da Conta
	
	private double saldo;
	private double limitecredito;
	private double limiteemprestimo;
	private String cartoes;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimitecredito() {
		return limitecredito;
	}
	public void setLimitecredito(double limitecredito) {
		this.limitecredito = limitecredito;
	}
	public double getLimiteemprestimo() {
		return limiteemprestimo;
	}
	public void setLimiteemprestimo(double limiteemprestimo) {
		this.limiteemprestimo = limiteemprestimo;
	}
	public String getCartoes() {
		return cartoes;
	}
	public void setCartoes(String cartoes) {
		this.cartoes = cartoes;
	}
	void devendo(){
		System.out.println("\nSua conta bancária está com saldo abaixo do esperado para pagar suas contas....");
	}
}
