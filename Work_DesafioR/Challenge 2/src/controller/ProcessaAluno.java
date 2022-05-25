package controller;

import java.util.ArrayList;

import model.Aluno;

public class ProcessaAluno {
	public static ArrayList<Aluno> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void load() {
		linhas = dao.abrir();
	}
	public static void saida() {
		dao.salvarMedia(linhas);
		System.out.println("Médias calculadas com sucesso!");
	}
}
