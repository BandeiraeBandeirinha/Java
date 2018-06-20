/**
 * Atividade de avalia��o - Churrascoladora
 * @author Geovani Bandeira, Victor Leite
 */

package br.com.java;

import java.util.Scanner;

public class ChurrasColadora {

	public static void main(String[] args) {
		double homem, mulher, crianca, carne, carne2, carne3, carne4, carnepreco, cerveja, cerveja1, cerveja2, cerveja3,
				cerveja4, refri, refri1, refri2, refri3, refri4, total, pessoa;
		// Vari�veis
		Scanner teclado = new Scanner(System.in);
		// Entrada
		System.out.println("������ CHURRASCOLADORA ??????");
		System.out.println("    ");
		System.out.println("________________________________________");
		System.out.println("    ");
		System.out.print("Quantidade de homens: ");
		homem = teclado.nextDouble();
		System.out.print("Quantidade de mulheres: ");
		mulher = teclado.nextDouble();
		System.out.print("Quantidade de crian�as: ");
		crianca = teclado.nextDouble();
		System.out.print("Pre�o m�dio do KG de carne: ");
		carne = teclado.nextDouble();
		System.out.print("Pre�o m�dio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.print("Pre�o m�dio da lata de refrigerante: ");
		refri = teclado.nextDouble();
		// Processamento da cerne
		carne2 = 0.3 * (homem + mulher);
		carne3 = 0.1 * crianca;
		carne4 = carne2 + carne3;
		carnepreco = carne4 * carne;
		// Processamento da cerveja
		cerveja1 = 12 * homem;
		cerveja2 = 4 * mulher;
		cerveja3 = cerveja1 + cerveja2;
		cerveja4 = cerveja3 * cerveja;
		// Processamento do Refri
		refri1 = 2 * (crianca + mulher);
		refri2 = refri1 * refri;
		// Processo Total
		total = carnepreco + cerveja4 + refri2;
		// Processo de divis�o por homem e mulher
		pessoa = total / (homem + mulher);

		// Sa�da
		System.out.println("   ");
		System.out.println("________________________________________");
		System.out.println("Lista de compras");
		System.out.println("   ");
		// Exibir quantidade e pre�o
		System.out.println("Quantidade total de carne: " + carne4 + " Pre�o em KG: R$" + carnepreco);
		System.out.println("Quantidade total de cerveja: " + cerveja3 + " Pre�o da cerveja: R$" + cerveja4);
		System.out.println("Quantidade total de refrigerante: " + refri1 + " Pre�o do refrigerante: R$" + refri2);
		System.out.println("   ");
		System.out.println("________________________________________");
		System.out.println("Valor total do churrasco: R$ " + total);
		System.out.printf("Valor por pessoa: R$ " + "%.1f", pessoa);

	}

}
