package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "D:\\Gabriel\\Senai2022\\FPOO\\Work_Space2\\SPOO\\dados\\entrada.csv";
	private String saida = "D:\\Gabriel\\Senai2022\\FPOO\\Work_Space2\\SPOO\\dados\\saida.csv";
	
	public ArrayList<Planilha> abrir(){
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String linha = br.readLine();
			while(linha != null) {
				p = new Planilha(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
		return linhas;
	}
	public void salvarSoma(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha p : linhas) {
				bw.write(p.adicao()+"\r\n");
			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado."+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto"+ e);
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
	}
	public void salvarSub(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha p : linhas) {
				bw.write(p.sub()+"\r\n");
			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado."+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto"+ e);
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
	}
	public void salvarMult(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha p : linhas) {
				bw.write(p.mult()+"\r\n");
			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado."+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto"+ e);
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
	}
	public void salvarDiv(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Planilha p : linhas) {
				bw.write(p.div()+"\r\n");
			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado."+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto"+ e);
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
	}
}
