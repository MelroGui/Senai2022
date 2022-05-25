package controller;

import java.util.ArrayList;

import model.Pessoa;

public class ProcessaPessoa {
	public static ArrayList<Pessoa> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void load() {
		linhas = dao.abrir();
	}
	public static void saida() {
		dao.salvarIdade(linhas);
		System.out.println("Idades calculadas com sucesso!");
	}
}
