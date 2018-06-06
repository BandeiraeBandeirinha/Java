package br.com.java;

import java.util.Scanner;

public class TemaLivre {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double km, mi;
		System.out.print("Coloque o valor de Milhas: ");
		mi = teclado.nextDouble();
		km = mi / 0.62137;
		System.out.println("Valor de KM: " + km);
		

	}

}
