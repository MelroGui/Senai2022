package model;

import java.util.Scanner;

public class Media {
	
	public static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		float media1, media2, result;
		
		System.out.println("Digite a primeira nota");
		media1 = sc.nextFloat();
		System.out.println("Digite a segunda nota");
		media2 = sc.nextFloat();
		
		result = (media1 + media2) / 2;
		System.out.printf("A media é: %.1f\n", result);
		
		if(result>5) {
			System.out.println("aprovado");
		}
		else{
			System.out.println("Reprovado");
		}
	}

}
