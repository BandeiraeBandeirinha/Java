package br.com.java;

import java.util.Scanner;

public class HoraDeServi�o {

	public static void main(String[] args) {
		double remuneracao, horas, custo, servico, estimativa, total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("______Calculadora do Servi�o______");
		System.out.print("Remunera��o mensal: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao *0.3) + custo + (remuneracao * 0.2)) / horas;
		System.out.println("Valor da hora de servi�o: " + servico);
		System.out.println(" ");
		System.out.println("Estimativa de horas desde servi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado  desde cliente: " + total);
		

	}

}
