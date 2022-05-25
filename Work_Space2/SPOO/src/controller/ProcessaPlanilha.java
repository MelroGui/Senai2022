package controller;

import java.util.ArrayList;
import modelo.Planilha;

public class ProcessaPlanilha {
	public static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void load() {
		linhas = dao.abrir();
	}
	public static void saida(int opcao) {
		switch(opcao) {
		case 1:
			dao.salvarSoma(linhas);
			break;
		case 2:
			dao.salvarSub(linhas);
			break;
		case 3:
			dao.salvarMult(linhas);
			break;
		case 4:
			dao.salvarDiv(linhas);
			break;
		case 5:
			System.out.println("Flw");
			break;
		default: 
			System.out.println("Opção Inválida.");
		}
	}
}
