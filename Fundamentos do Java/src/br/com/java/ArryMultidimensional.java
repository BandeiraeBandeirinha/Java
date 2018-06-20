package br.com.java;

public class ArryMultidimensional {

	public static void main(String[] args) {
		// Portifólio
		// a linha abaixo cria um array multidimensional (matriz)
		double[][] boletim = {{8,7,9,3},{4,5,8,6}};
		// recuperando a nota de português do 3° bimestre
		System.out.println("Média de português de 3° bim: " + boletim [1][2]);
	}

}
