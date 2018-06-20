package br.com.java;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		// Portifólio
		String nome;
		short idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a sua idade: ");
		idade =  teclado.nextShort();
		System.out.println("");
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		System.out.println("Nome: " + nome);
		System.out.println("Idade : " + idade);
		//if e else
		if(idade <18) {
			System.out.println("Menor de Idade");
		}else {
		System.out.println("Maior de Idade");
		}

	}

}
