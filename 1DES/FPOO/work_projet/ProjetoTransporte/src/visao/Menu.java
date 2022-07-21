package visao;

import java.util.Scanner;

import modelo.Veiculo;

	public class Menu {
	
	private static Scanner scan = new Scanner(System.in);
	private static Veiculo veiculos[] = new Veiculo[10];
	private static String itens[] = {"Cadastrar Veiculo","Listar Veiculo","Sair"};
	private static int menu = 0;
	private static int indice = 0;
	
	public static void main(String[] args) {
		while(menu != 3);
		menu = printMenu(itens);
		switch(menu) {
		case 1:
			cadastrarVeiculo();
			break;
		case 2:
			listarVeiculo();
			break;
		case 3:
			System.out.println("Até A Proxima");
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		
		}
	}
	
	private static int printMenu(String[] itens) {
		for(int i = 0; i < itens.length; i++)
			System.out.println((i+1)+"."+itens[i]);
			System.out.print("Escolha Uma Opção: ");
			
			return scan.nextInt();
	}

	private static void cadastrarVeiculo() {
		System.out.println("placa\tMarca\tModelo\tAno Modelo\tAno Fabricação\tCor:");
		veiculos[indice] = new Veiculo( scan.next(), scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
			scan.next();
			indice++;
	}
	
	private static void listarVeiculo() {
		for(int i = 0; i < indice; i++) {
			System.out.println(veiculos[i].toString());
			
			
		}
	}
	
	}
