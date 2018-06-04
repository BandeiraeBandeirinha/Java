package br.com.java;

import java.util.Scanner;

public class ConversorDeDolar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double dolar, real;
		dolar = 3.73;
		System.out.print("Digite o Valor em Real: ");
		real = teclado.nextDouble();
		real = + dolar * real;
		System.out.println("Valor do Dolar: 3.73");
		System.out.println("Valor do Real em Dolar: " + real);
		
		
		
		
	}

}
