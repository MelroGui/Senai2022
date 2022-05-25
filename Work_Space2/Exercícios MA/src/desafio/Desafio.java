package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pagina pag = new Pagina();
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Cadastrar Pessoa\n2. Listar Pessoas\n3. Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
			case 1:
				System.out.println("Digite um título pra página: ");
				String titulo = sc.nextLine();
				System.out.println("Digite uma tag que quer colocar: ");
				String tag1 = sc.nextLine();
				System.out.println("Digite o que quer colocar dentro da tag: ");
				String tag2 = sc.nextLine();
				System.out.println("Digite a url de uma imagem pro background: ");
				String img = sc.next();
				
				pag.escrever("<head><title>"+titulo+"</title></head>"+";"+"<" +tag1+">"+"<" +tag1+ ">"+";"+ tag2 +";"+ img, "index", true);
				System.out.println("Página criada com sucesso!");
				break;
			case 2:
				ArrayList<String> infoFile = pag.listar("index");
				for(String linha : infoFile) {
					String[] indice = linha.split(":");
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
