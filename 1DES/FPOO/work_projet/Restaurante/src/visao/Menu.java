package visao;

import java.util.Scanner;
import model.Prato;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private static Prato pratos[] = new Prato[10];
	public static void main(String[] args) {
		
		int menu = 0;
		while(menu != 2) {
			System.out.println("Escolha uma opção\n");
			System.out.println("1.[Cadastrar Prato]\n2.[Listar Pratos]\n3.Sair");
			menu = sc.nextInt();
			switch(menu) {
			case 1: 
				cadastrarPrato();
				break;
			case 2: 
				listarPratos();
				break;			
			case 3:
				System.out.println("Vai embora");
				break;
			default:
			    System.out.println("Opção invalida");
			}
		}
	}
	private static void cadastrarPrato() {
		for(int i = 0;i < pratos.length; i++) {
			if(pratos[i] == null) {
				System.out.println("[Codigo do Prato]");
				int codigoPrato = sc.nextInt();
				System.out.println("[Nome do Prato]");
				String nome = sc.next();
				System.out.println("[Tipo do Prato]");
				String tipo = sc.next();
				System.out.println("[Descrição do Prato]");
				String descricao = sc.next();
				System.out.println("[Preço do Prato]");
				float preco = sc.nextFloat();
				pratos[i] = new Prato(codigoPrato, nome, tipo, descricao, preco);
				System.out.println("Prato cadastrado com sucesso!!!");
				break;
			}
		}
	}
	private static void listarPratos() {
		boolean temnada= false;
		for(int i = 0; i < pratos.length; i++) {
			if(pratos[i] != null) {
				System.out.println(pratos[i].toString());
				temnada = true;
			}
		}
		if (!temnada) {
			System.out.println("Tem Nada");
		}
	}
}