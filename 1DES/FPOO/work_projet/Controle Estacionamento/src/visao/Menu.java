package visao;

import java.util.ArrayList;
import java.util.Scanner;

import model.Carro;

public class Menu {

public static void main(String[] args) {

		Carro car = new Carro();
		Scanner input = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("1 - Cadastrar carro;");
			System.out.println("2 - Listar carro;");
			System.out.println("0 - Sair;");
			opcao = input.nextInt();
			input.nextLine();

			switch(opcao) {
				case 1: 
					System.out.println("Informe a  placa : ");
					String placa = input.nextLine();

					System.out.println("Informe a marca : ");
					String marca = input.nextLine();

					System.out.println("Informe o modelo : ");
					String modelo = input.nextLine();

					System.out.println("Informe a cor : ");
					String cor = input.nextLine();

					String carro = placa + ";" + marca + ";" + modelo + ";" + cor + ";";

					car.escrever(carro, "Carros", true);
					break;
				case 2:
					ArrayList<String> infoFile = car.ler("Carros");

					System.out.println("Informe a placa que deseja localizar : ");
					String busca = input.nextLine();

					for(String linha : infoFile) {
						String[] temp = linha.split(";");
						if(temp[0].toLowerCase().contains(busca.toLowerCase())) {
							System.out.println("Placa : " + temp[0]);
							System.out.println("Marca : " + temp[1]);
							System.out.println("Modelo : " + temp[2]);
							System.out.println("cor : " + temp[3]);
						}
					}
					break;
				case 0:
					System.out.println("Inté");
					break;
			}
		}while(opcao != 0);		
	}
}