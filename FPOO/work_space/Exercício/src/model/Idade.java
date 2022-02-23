package model;

import java.util.Scanner;

public class Idade {

	public static Scanner sc; 
	public static void main(String[] args) {
		int idade;
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Digite sua idade");
			idade = sc.nextInt();
		} 
		if(idade>=18) {
		System.out.println("Maior de idade");
		
		}
		else{
		System.out.println("Menor de idade");
		
		}
	}

}
