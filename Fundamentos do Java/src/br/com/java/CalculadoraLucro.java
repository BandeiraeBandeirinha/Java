package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		// Portif�lio
		double custo, lucro, venda;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calculadora do lucro");
		System.out.println("");
		System.out.print("Pre�o de custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		// Processamento
		venda = custo + ((custo * lucro) / 100);
		// Sa�da
		System.out.println("Pre�o de venda: " + venda);
		

	}

}
