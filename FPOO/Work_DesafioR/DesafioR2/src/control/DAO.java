package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Aluno;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 2\\dados\\entradas.csv";
	private String saida = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 2\\dados\\saida.csv";
	
	public ArrayList<Aluno> abrir(){
		ArrayList<Aluno> linhas = new ArrayList<>();
		Aluno a;
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String linha = br.readLine();
			while(linha != null) {
				a = new Aluno(linha);
				linhas.add(a);
				linha = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println("Erro geral " + e);
		}
		return linhas;
	}
	public void salvarMedia(ArrayList<Aluno> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Aluno a : linhas) {
				bw.write(a.calcMedia()+"\r\n");
			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado. "+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto "+ e);
		} catch (Exception e) {
			System.out.println("Erro geral " + e);
		}
	}
}