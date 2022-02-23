package model;

import java.util.Scanner;
public class menu {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int menu =0;
		
		System.out.println("1. Engatinhar");;
		System.out.println("2. Andar");
		System.out.println("3. Correr");
		System.out.println("4. Pedalar");
		System.out.println("5. Dirigir");
		System.out.println("6. Pilotar");
		
		menu = entrada.nextInt();

		switch (menu) {
		case 1: 
			System.out.println("oía la a criança ta andando");
			break;
		case 2: 
			System.out.println("carai bo caminhar?");
			break;
		case 3:
			System.out.println("dois maluco numa moto vindo");
			break;
		case 4: 
			System.out.println("bo da uns grus de bickecicleta");
			break;
		case 5: 
			System.out.println("pai ta motorizado");
			break;
		case 6: 
			System.out.println("acima de mim só deus e a roda da frente");
			break;
			
			default:
				System.out.println("Opções invalida");
				break;
		
		} 
	}

}
