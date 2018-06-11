package br.com.java;

import java.util.Scanner;
import java.util.Random;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
		  // a linha abaixo sua a classe random para criar um objeto que sera usado para gerar n�meros aleat�rios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar n�meros aleat�rios (0 a 5)
			//Somamos 1 ao resultado pois n�o existe a face 0 no dado
			System.out.println("Face do dado = " + face);
			System.out.println("Deseja jogar novamente? (s/n)");
			//charAt(0) captura apenas a 1� letra do que foi digitado
			opcao = teclado.next().charAt(0);
		}while(opcao == 's');

	}

}
