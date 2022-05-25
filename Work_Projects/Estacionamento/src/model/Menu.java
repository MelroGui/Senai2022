package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Cadastrar Carro\n2. Listar Carros\n3. Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
			case 1:
				System.out.println("Informe a Marca: ");
				String marca = sc.next();
				System.out.println("Informe o Modelo: ");
				String modelo = sc.next();
				System.out.println("Informe a sua cor: ");
				String cor = sc.next();
				System.out.println("Informe a placa: ");
				String placa = sc.next();
				
				String carro = marca+ ";" +modelo+ ";" +cor+ ";" +placa+ ";";
				cad.cadastrar(carro, "Carros", true);
				System.out.println("Carro cadastrado com sucesso!");
				break;
			case 2:
				ArrayList<String> infoFile = cad.listar("Carros");
				System.out.println("Digite a placa do veículo que deseja buscar: ");
				String busca = sc.nextLine();
				for(String linha : infoFile) {
					String[] indice = linha.split(";");
					if(indice[3].toLowerCase().contains(busca.toLowerCase())){
						System.out.println("Marca: "+indice[0]);
						System.out.println("Modelo: "+indice[1]);
						System.out.println("Cor: "+indice[2]);
						System.out.println("Placa: "+indice[3]);
					}
				}
				break;
			case 3:
				System.out.println("Flw!");
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
