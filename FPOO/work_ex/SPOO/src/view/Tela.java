package view;

import java.util.Scanner;

import control.ProcessaPlanilha;

public class Tela {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ProcessaPlanilha.carregar();
		int menu = 0;
		while(menu != 5) {
			System.out.println("1. Adição\n2. Sub\n3. Mult\n4. Div\n5. Sair");
			menu = sc.nextInt();
			ProcessaPlanilha.saida(menu);
		}
	}
}