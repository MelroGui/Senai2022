package control;

import java.util.ArrayList;

import model.Planilha;

public class ProcessaPlanilha {
	static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();

	public static void carregar() {
		linhas  = dao.abrir();
	}
	
	public static void saida(int opcao) {
		switch (opcao) {
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
			System.out.println("VAZA NOIA");;
			break;
		default: 
			System.out.println("Opção errada amigo");
		}
	}
}