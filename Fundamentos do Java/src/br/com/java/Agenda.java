package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		// a linha abaixo cria um array multidimensional (matriz)
	String[][] agenda = {{"Bill Gates" , "1111-1111" , "bill@outlook.com"},
				        {"Linus Torvalds" , "2222-2222" , "linus@gmail.com"},
				        {"Steve Jobs","3333-3333","steve@icloud.com"}};
	/*System.out.println("Nome: " + agenda[0][0] + " / Numero: " + agenda[0][1] + " / Email: " + agenda[0][2]);
	System.out.println("  ");
	System.out.println("Nome: " + agenda[1][0] + " / Numero: " + agenda[1][1] + " / Email: " + agenda[1][2]);
	System.out.println("  ");
	System.out.println("Nome: " + agenda[2][0] + " / Numero: " + agenda[2][1] + " / Email: " + agenda[2][2]);
	System.out.println(" ");
	agenda[1][2] = "linus@gmail.com";
	System.out.println("Recuperar e-mail: " + agenda[1][2]);
	System.out.println(" ");
	agenda[0][1] = "9999-9999";
	System.out.println(agenda[0][1]);*/
	for (int i = 0; i < agenda.length; i++){
		System.out.println("_______________________________________________");		
	for (int j = 0; j < agenda[i].length; j++) {
		System.out.println(agenda[i][j]);
	}
	}
	
	}

}
