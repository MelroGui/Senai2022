package exs;

import java.util.Scanner;
import java.util.Random;

public class Matrícula {

	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quantas pessoas deseja classificar:");
		int comprimento = scan.nextInt();

		String[] nomes = new String[comprimento];
		int[] idades = new int[comprimento];
		for(int i = 0; i < comprimento; i++) {
			System.out.print("Nome["+i+"]: ");
			nomes[i] = scan.next();
			System.out.print("Idade["+i+"]: ");
			idades[i] = scan.nextInt();

		for(int j = 0; j < comprimento; j++) {
			if(idades[j]<10) {
				System.out.println(nomes[j]+" criança.");
			}else if(idades[j]<20) {
				System.out.println(nomes[j]+" Jovem.");
			}else {
				System.out.println(nomes[j]+" veio.");
	
			}
			}
		} 		 
	}
}