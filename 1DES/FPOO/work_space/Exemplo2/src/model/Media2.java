package model;

import java.util.Scanner;

public class Media2 {

	public static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int m1, m2, Mr;
		
		System.out.println("Digite a primeira nota");
		m1 = sc.nextInt();
		System.out.println("Digite a segunda nota");
		m2 = sc.nextInt();
		
		Mr = (m1 + m2) / 2;
		System.out.println("O result é: "+ Mr);
		
		if(Mr>=5) {
			System.out.println("Aprovado");
			
		}
		else {
			System.out.println("Reprovado");
			
		}

	}

}
