package br.com.java;

import java.util.Scanner;

public class VerificarObrigarioteridadeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verificar obrigatoriedade de votar");
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		/* Crit�rops
		 * Menor que 16 - Proibido votar
		 * 16,17 ou acima de 70 - Voto Facultativo
		 * Entre 18 e 70 - Obrigat�rio vota
		 */
       
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade == 16 || idade == 17 || idade > 70) {
            System.out.println("Voto facultativo");
		} else {
			System.out.println("Voto obrigat�rio");
		}
		
		
		
}

}