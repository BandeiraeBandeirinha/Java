package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		// Portif�lio
		Scanner teclado = new Scanner(System.in);
		double gas, alc, result;
		System.out.println("Calculadora FLEX");
		System.out.print("Digite o valor do �lcool: ");
		alc = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gas = teclado.nextDouble();
		result = alc / gas;
		System.out.printf("Resultado: " + "%.2f", result);
		System.out.println("");
		if (result < 0.7) {
		System.out.println("Maior vantagem em abastecer com �lcool");
		} else {
        System.out.println("Maior vantagem em abastecer com Gasolina");
		}
		
		

	}

}
