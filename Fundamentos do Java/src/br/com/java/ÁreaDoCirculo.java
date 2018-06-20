package br.com.java;

import java.util.Scanner;

public class ÁreaDoCirculo {
	
	public static void main(String[] args) {
		// Portifólio
		Scanner teclado = new Scanner(System.in);
		double area, pi, raio;
		pi = 3.14;
		System.out.print("Digite o Valor de Raio: ");
		raio = teclado.nextDouble();
		raio = raio * raio;
		System.out.println("Valor do Raio²: " + raio);
		System.out.println("Pi = 3.14");
		System.out.println("Área do Circulo (r² * Pi): " + raio * pi);
		
	}

}
