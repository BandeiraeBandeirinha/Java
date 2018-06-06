package br.com.java;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double f, c, resultado;
		//Pedindo inserir o numero pelo teclado
		System.out.print("Digite o Valor em Fahrenheit : ");
		f = teclado.nextDouble();
		//Processamento
		c = (f - 32) / 1.8;
		//Saída
		System.out.println("Valor em Celsius : " + c);
		
		
		
		
	}

}
