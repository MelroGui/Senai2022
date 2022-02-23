package model;

import java.util.Scanner;

public class Vitor {

	public static Scanner sc;
	public static void main(String[] args) {
	sc = new Scanner(System.in);	
	
	int comprimento = 3;

	String[] nomes = new String[3];
	int[] idades = new int[3];
	for(int i = 0; i < 3; i++) {
		System.out.println("Nomes["+ i + "]");
		nomes[i] = sc.next();
		
		System.out.println("Idades["+ i + "]");
		idades[i] = sc.nextInt();
	 	}
	for(int i = 0; i < 3; i++) {
		if(idades[i]<10) {
			System.out.println(nomes[i] + " criança esperança");
		}else if(idades[i]<20) {
			System.out.println(nomes[i] + "Pq estoy vivo");			
		}
		}else {
			System.out.println(nomes[i] + " AAAAAAAAAAAAAA");			
		}
		}
	}

