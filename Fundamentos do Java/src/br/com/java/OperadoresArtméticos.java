package br.com.java;

import java.util.Scanner;

public class OperadoresArtméticos {

	public static void main (String[] args) {
		// Portifólio
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritmética");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y =" + (x + y));
		// Subtração
		System.out.println("x - y =" + (x - y));
		// Divisão
		System.out.println("x / y = " + (x / y));
		// Multiplicação
		System.out.println("x * y = " + (x * y));
		//Módulo
		System.out.println("x % y = " + (x % y));
		// Incremento x++ (equivale a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- (equivale a y = y -1)
		y--;
		System.out.println("y-- " + y);
		

	}

}
