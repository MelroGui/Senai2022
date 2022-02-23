package exercicios;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.print("Insira o valor do 1º lado: ");
		A = sc.nextInt();
		System.out.print("Insira o valor do 2º lado: ");
		B = sc.nextInt();
		System.out.print("Insira o valor do 3º lado: ");
		C = sc.nextInt();
		
		if (A == B && B == C) {
			System.out.println("O triangulo é Equilátero.");
		} else if (A != B && B != C) {
			System.out.println("O triangulo é Escaleno");
		} else {
			System.out.println("O triangulo é Isósceles.");
		}
	}
}
