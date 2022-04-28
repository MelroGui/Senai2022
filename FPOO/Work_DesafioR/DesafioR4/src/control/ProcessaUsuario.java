package controller;

import java.util.ArrayList;

import model.Usuario;

public class ProcessaUsuario {
	public static ArrayList<Usuario> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static ArrayList<Usuario> load() {
		linhas = dao.abrir();
		return linhas;
	}
}
