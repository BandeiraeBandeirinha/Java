package br.com.java;

import java.util.Scanner;

public class EstudoWhile {

	public static void main(String[] args) {
		// Portif�lio
		int x = 11;
		int y = 11;
		//executa o la�o enquanto a condi��o for verdadeira
		while (x < 10) {
			System.out.println(x + " teste while");
			x++;
		}
		System.out.println("  ");
		do {
			System.out.println(y + " teste do while");
			y++;
		//executa o la�o pelo menos uma vez independente da condi��o
		}while(y < 10);
			
		}
		
	}
