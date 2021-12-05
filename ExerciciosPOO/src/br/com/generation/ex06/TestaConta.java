package br.com.generation.ex06;

public class TestaConta {
	public static void main(String[]args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setSaldo(2000.86);
		conta1.setLimitecredito(12000.35);
		conta1.setLimiteemprestimo(30000);
		conta1.setCartoes("Nubank");
		
		System.out.println("Seu cartão "+conta1.getCartoes()+" tem um total de R$"+conta1.getSaldo()+""
				+ " de saldo, com um limite de R$"+conta1.getLimitecredito()+" de crédito e saldo para emprestimo de R$"+conta1.getLimiteemprestimo());
		
		conta1.devendo();
	}
		
}
