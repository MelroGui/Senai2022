package control;

import java.util.ArrayList;

import model.Manutencao;
import model.DAO;

public class ProcessaManutencoes {

	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void abrir() {
		manutencoes = dao.ler();
	}
	
	public static void salvar() {
		dao.escrever(manutencoes);
	}
	
}