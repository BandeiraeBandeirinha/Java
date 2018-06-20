/**
 * Atividade JoKenPo
 * @author Geovani , Sabrina , Victor Leite
 * Data 06/13/2018
 */

package br.com.java;

import java.util.Scanner;
import java.util.Random;

public class JoKenPo {
	
	// Portifólio

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
		int jogador, player1 = 0, player2 = 0;
		System.out.println("      ");
		System.out.println("<><><>JoKenPo<><><>");
		System.out.println("----------------------");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("----------------------");
        System.out.print("Opção do Jogador: ");
        jogador = teclado.nextInt();
        System.out.println("----------------------");
        switch (jogador) {
        case 1:
        	Pedra();
        	System.out.println("Jogador escolheu Pedra");
        	break;
        case 2:
        	Papel();
        	System.out.println("Jogador escolheu Papel");
        	break;
        case 3:
        	Tesoura();
        	System.out.println("Jogador escolheu Tesoura");
        	break;
        default:
            System.out.println("Opção inválida");
            break;
        }
        Random dado = new Random();
        int maquina = dado.nextInt(2) + 1;
        switch (maquina) {
        case 1:
        	Pedra();
        	System.out.println("Maquina escolheu Pedra");
        	break;
        case 2:
        	Papel();
        	System.out.println("Maquina escolheu Papel");
        	break;
        case 3:
        	Tesoura();
        	System.out.println("Maquina escolheu Tesoura");
        	break;
        default:
            System.out.println("Opção inválida");
            break;
        }
        System.out.println("-------------------------------");
        if (jogador == 1 && maquina == 3 || jogador == 2 && maquina ==1 || jogador == 3 && maquina == 2) {	
        	System.out.println("Jogador Venceu");
        	player1++;
        } else if (maquina == 1 && jogador == 3 ||  maquina == 2 && jogador ==1 || maquina == 3 && jogador == 2) {
        	System.out.println("Maquina Venceu");
        	player2++;
        } else {
        	System.out.println("Empate");
        }
        System.out.println("-------------------------------");
        System.out.println("__________PLACAR___________");
        System.out.println(player1 + " X " + player2);
        System.out.println("-------------------------------");
        System.out.print("Deseja jogar novamente? (s/n) : ");
		opcao = teclado.next().charAt(0);
		}while (opcao == 's');
	}

	private static void Tesoura() {
	}
	private static void Papel() {
	}
	private static void Pedra() {
	}
	
	
}
