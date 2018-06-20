package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// Portifólio
		// a linha abaixo cria variaveis do tipo real
		float nota1, nota2, media;
		// entrada
		System.out.print("Digite a nota1: ");
		// a linha abaixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		//a linha abaixo usa o objeto teclado para capturar a o que foi digitado
		//no console e armazenar na variável nota 1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextFloat();
		//processamento
		media = (nota1+ nota2) / 2;	
		//saída
		//+ concatena (junta) um texto com um conteudo da variavel média
		System.out.println("Média final: " + media);
		//menos ou igual a 2 - REPROVADO
		//entre 2 e 5 - RECUPERAÇÃO
		//maior ou igual a 5 - APROVADO
		if (media <=2) {
        System.out.println("REPROVADO");
		} else if(media > 2 && media < 5) {
        System.out.println("RECUPERAÇÂO");
		}else {
		System.out.println("APROVADO");
	    }	
	
    }
	
}
