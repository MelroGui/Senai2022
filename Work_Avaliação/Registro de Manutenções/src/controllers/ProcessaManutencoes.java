package controllers;

import java.util.ArrayList;

import model.Manutencao;
import model.dao.ManutencaoDAO;

public class ProcessaManutencoes {
	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static ManutencaoDAO md = new ManutencaoDAO();
	
	public static void abrir() {
		manutencoes = md.ler();
	}
	
	public static void salvar() {
		md.escrever(manutencoes);
	}
}
