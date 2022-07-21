package model;

import java.util.Scanner;

public class Idade2 {

	public static Scanner sc; 
	public static void main(String[] args) {
		int anoNascimento, anoAtual;
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Digite o ano q vc nasceu");
			anoNascimento = sc.nextInt();
		} 
		
		anoAtual = 2022 - anoNascimento;
		
		if(anoAtual>=18) {
		System.out.println("Maior de idade");
		
		}
		else{
		System.out.println("Menor de idade");
		
		}
	}

}
