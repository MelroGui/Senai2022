package view;

import java.util.Scanner;

import controller.ProcessaPlanilha;

public class Tela {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
	ProcessaPlanilha.load();
	int menu = 0;
		while(menu != 5) {
			System.out.println("|1. Adi��o|\n|2. Subtra��o|\n|3. Multiplica��o|\n|4. Divis�o|\n5. Sair|");
			menu = sc.nextInt();
			ProcessaPlanilha.saida(menu);
		}
	}
}
