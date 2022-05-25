package view;

import java.util.Scanner;

import controller.ProcessaPlanilha;

public class Tela {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
	ProcessaPlanilha.load();
	int menu = 0;
		while(menu != 5) {
			System.out.println("|1. Adição|\n|2. Subtração|\n|3. Multiplicação|\n|4. Divisão|\n5. Sair|");
			menu = sc.nextInt();
			ProcessaPlanilha.saida(menu);
		}
	}
}
