package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProcessaUsuario;
import model.Usuario;

public class MainMenu {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	public static void main(String[] args) {
		int menu = 0;

		do {
			System.out.println("|1. Logar|\t|0. Sair|");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				logar();
				break;
			case 0:
				System.out.println("Vlw Flw!");
				break;
			default:
				System.out.println("Opção Inválida");
			}
		} while (menu != 0);
	}

	private static void logar() {
		System.out.println("Digite o User/Email: ");
		String user = sc.next();
		System.out.println("Digite a Senha: ");
		String senha = sc.next();

		usuarios = ProcessaUsuario.load();
		boolean emailE = false, senhaE = false;
		for (Usuario u : usuarios) {
			if (u.getEmail().equals(user) && u.getSenha().equals(senha)) {
				emailE = true;
				senhaE = true;
				break;
			} else if (u.getEmail().equals(user) && !u.getSenha().equals(senha)) {
				emailE = true;
				senhaE = false;
			}
		}
		if(emailE && senhaE) {
			System.out.println("Acesso Permitido!");
		}else if(emailE && !(senhaE)) {
			System.out.println("Acesso Negado!");
		}else {
			System.out.println("Usuário não Encontrado");
		}
	}
}
