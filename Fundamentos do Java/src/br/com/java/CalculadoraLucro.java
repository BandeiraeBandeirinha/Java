package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		// Portifólio
		double custo, lucro, venda;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calculadora do lucro");
		System.out.println("");
		System.out.print("Preço de custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		// Processamento
		venda = custo + ((custo * lucro) / 100);
		// Saída
		System.out.println("Preço de venda: " + venda);
		

	}

}
