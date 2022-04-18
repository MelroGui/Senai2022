package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		
		int opcao = 0;
		
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();
		switch(opcao) {
			case 1:
				System.out.println("Informe o seu nome :");
				String nome = sc.nextLine();
				
				System.out.println("Informe sua idade :");
				String idade = sc.next();
				
				System.out.println("Informe sua cidade :");
				String city = sc.next();
				
				String data = nome + ";\t" + idade + ";\t" + city;
				
				arq.escrever(data, "Pessoas", true);
			break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Pessoas");
				
				String busca = "Fulano";
				
				for(String linha : infoFile) {
					String[] temp = linha.split(";");
					if(temp[0].toLowerCase().contains(busca.toLowerCase())) {					
					System.out.println("Nome :" + temp[0]);
					System.out.println("Idade :" + temp[1]);
					System.out.println("Cidade :" + temp[2]);
					}
				}
			break;
			default:
				System.out.println("Opção Invalida");
			break;
			} 
		}while(opcao != 0);
	}
}
