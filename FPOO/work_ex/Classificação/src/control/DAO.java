package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Planilha;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "D:\\GuiM\\Senai2022\\FPOO\\work_ex\\Classificação\\dados\\entrada.csv";
	private String saida = "D:\\GuiM\\Senai2022\\FPOO\\work_ex\\Classificação\\dados\\saida.csv";

	public ArrayList<Planilha> abrir() {
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));

			String l = br.readLine();
			while (l != null) {
				p = new Planilha("");
				linhas.add(p);
				l = br.readLine();
			}
			br.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));

			for (Planilha p : linhas) {
				bw.write(p.adicao());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("pe");
		}
	}

	public void salvarSub(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));

			for (Planilha p : linhas) {
				bw.write(p.sub());
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarMult(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));

			for (Planilha p : linhas) {
				bw.write(p.mult());
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void salvarDiv(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));

			for (Planilha p : linhas) {
				bw.write(p.div());
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}