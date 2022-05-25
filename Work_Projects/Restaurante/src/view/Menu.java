package view;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import model.Prato;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private static Prato[] pratos = new Prato[10];
	public static void main(String[] args) throws IOException {
		
		int menu = 0;
		while(menu != 3) {
			opcoes();
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				cadastrarPrato();
				break;
			case 2:
				listarPratos();
				break;
			case 3:
				System.out.println("Vlw Flw!");
				break;
			default:
				System.out.println("Opção Inválida.\n");
			}
		}
	}
	private static void cadastrarPrato() throws IOException {
		for (int i = 0; i < pratos.length; i++) {
			if(pratos[9] == null) {
				if(pratos[i] == null) {
					System.out.println("Informe o código do Prato: ");
					int codPrato = sc.nextInt();
					System.out.println("Informe o nome do Prato: ");
					String nome = sc.next();
					System.out.println("Informe o tipo do Prato: ");
					String tipo = sc.next();
					System.out.println("Informe a descrição do Prato: ");
					String descricao = sc.next();
					System.out.println("Informe o preço: ");
					float preco = sc.nextFloat();
					pratos[i] = new Prato(codPrato, nome, tipo, descricao, preco);
					System.out.println("Prato foi cadastrado com sucesso!\n");
					break;
				}
			} else {
				System.out.println("Excedeu o Limite.");
				break; 	
			}
		}
	}
	private static void listarPratos() {
		boolean vazio = false;
		for (int i = 0; i < pratos.length; i++) {
			if (pratos[i] != null) {
				System.out.println(pratos[i].toString());
				vazio = true;
			}
		}
		if(!vazio) {
			System.out.println("Não existem pratos cadastrados!\n");
		}
	}
	public static void opcoes() {
		String[] opcoes = new String[3];
		opcoes[0] = "1. |Cadastrar Prato|";
		opcoes[1] = "2. |Listar Pratos|";
		opcoes[2] = "3. Sair";
		
		for(int i = 0; i < opcoes.length; i++) {
			System.out.println(opcoes[i]);
		}
	}
}
