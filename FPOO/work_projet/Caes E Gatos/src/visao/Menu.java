package visao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Cao;
import model.Gato;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private static Cao cao;
	private static Gato gato;
	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		int menu = 0;
		while (menu != 3) {
			opcoes();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				break;
			case 4:
				System.out.println("Vlw Flw!");
				break;
			default:
				System.out.println("Opção Inválida.\n");
			}
		}
	}

	private static void cadastrar() throws IOException {
		int subMenu = 0;
		while (subMenu != 3) {
			System.out.println("\t\t1. |Cadastrar Cão|\n\t\t2. |Cadastrar Gato|\n\t\t3. Sair");
			subMenu = sc.nextInt();
			switch (subMenu) {
			case 1:
				System.out.println("\t------|Informe as informações do Cão|------");
				System.out.println("\t\t|Nome, Raça, peso e quantos motoqueiros foram assustados|");
				cao = new Cao(sc.next(), sc.next(), sc.nextFloat(), sc.nextInt());
				caes.add(cao);
				System.out.println("\t\tCão cadastrado com sucesso!\n");
				break;
			case 2:
				System.out.println("\t------|Informe as informações do Gato|------");
				System.out.println("\t\t|Nome, Raça, peso e quantas vidas ele já perdeu|");
				gato = new Gato(sc.next(), sc.next(), sc.nextFloat(), sc.nextInt());
				gatos.add(gato);
				System.out.println("\t\tGato cadastrado com sucesso!\n");
				break;
			case 3:
				System.out.println("\t\tObrigado!\n");
				break;
			default:
				System.out.println("\t\tOpção Inválida.\n");
			}
		}
	}

	private static void listar() {
		System.out.println("\t\t1. |Listar Cães|\n\t\t2. |Listar Gatos|");
		int op = sc.nextInt();
		if(op == 1) {
			for(Cao c : caes) {
				System.out.println("\t\t"+c.toString());
			}
		} else if(op == 2) {
			for(Gato g : gatos) {
				System.out.println("\t\t"+g.toString());
			}
		}
		else {
			System.out.println("\t\tOpção Inválida.");
		}
	}
	private static void alterar() {

	}

	private static void deletar() {

	}

	public static void opcoes() {
		String[] opcoes = new String[5];
		opcoes[0] = "\t1. |Cadastrar Animal|";
		opcoes[1] = "\t2. |Listar Animal|";
		opcoes[2] = "\t3. |Alterar Animal|";
		opcoes[3] = "\t4. |Deletar Animal|";
		opcoes[4] = "\t5. Sair";

		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(opcoes[i]);
		}
	}
}