package br.com.java;

import java.util.Scanner;

public class �reaDoCirculo {
	
	public static void main(String[] args) {
		// Portif�lio
		Scanner teclado = new Scanner(System.in);
		double area, pi, raio;
		pi = 3.14;
		System.out.print("Digite o Valor de Raio: ");
		raio = teclado.nextDouble();
		raio = raio * raio;
		System.out.println("Valor do Raio�: " + raio);
		System.out.println("Pi = 3.14");
		System.out.println("�rea do Circulo (r� * Pi): " + raio * pi);
		
	}

}
