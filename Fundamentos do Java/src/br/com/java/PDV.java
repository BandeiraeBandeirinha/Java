package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// Portif�lio
		double custo, desconto, total, troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de desconto");
		//Entrada
		System.out.print("Pre�o de Custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de Desconto: ");
		desconto = teclado.nextDouble();
		//Processamento
		total = custo - ((custo * desconto) /100);
		//Sa�da
		System.out.println("Pre�o a pagar: " + total);
		//Disconto
		troco = + (custo - total);
		System.out.println("Desconto: " + troco);
	    //Troco
		System.out.print("Valor Recebido: ");
		troco = teclado.nextDouble();
		troco = + (troco - total);
		System.out.println("Troco ao cliente: " + troco);
		
	}

}
