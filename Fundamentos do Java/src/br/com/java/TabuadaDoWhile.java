package br.com.java;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		// Portifólio
		int y = 1;
		int x; //Variável de apoio ao laço while
		Scanner teclado = new Scanner(System.in);
		System.out.println("*_*_*_* Tabuada *_*_*_*");
		System.out.println("  ");
		System.out.print("Digite o valor da tabuada: ");
		x = teclado.nextInt ();
		System.out.println("  ");
        while (y < 11) {
        	System.out.println(x + " x " + y + " = " + (x * y));
        	y++;
	}

}
	
}
