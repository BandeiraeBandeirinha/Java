package br.com.java;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double peso, altura , result;
		System.out.println("Calculando o Índice de Massa Corporal");
		System.out.print("Coloque seu peso (Kg) : ");
		peso = teclado.nextDouble ();
		System.out.print("Coloque sua altura (Metros) : ");
		altura = teclado.nextDouble ();
		altura = altura * altura;
		result = peso / altura;
		System.out.println("Seu índice de massa corporal: " + result);
	if (result < 17) {
	    System.out.println("Muito abaixo do peso");
	} else if (result == 17 || result == 18,49 ) {
		System.out.println("Abaixo do peso");
	} else if (result ){
		
	}
		
	}

	}

}
