package br.com.generation.matriz;

public class ExemploMatriz02 {
	public static void main(String[]args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 8.8;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 5.6;
		notasAlunos[1][3] = 5.8;
		
		System.out.println("Calculando a m?dia de cada aluno: ");
		
		for(int l = 0; l < notasAlunos.length; l++) {
				double soma = 0;
				double media = 0;
			for(int c = 0; c <notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
				media = soma / notasAlunos[l].length;
				
			}
			System.out.println("M?dia " +media);
		//	System.out.printf("\nM?dia do "+(l+1)+"? Aluno: %.3f", (soma /4));
		}
		
	}
}
