package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Pessoa;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 1\\dados\\pessoas.csv";
	private String saida = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 1\\dados\\saida.csv";
	
	public ArrayList<Pessoa> abrir(){
		ArrayList<Pessoa> linhas = new ArrayList<>();
		Pessoa p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String linha = br.readLine();
			while(linha != null) {
				p = new Pessoa(linha);
				linhas.add(p);
				linha = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println("Erro geral " + e);
		}
		return linhas;
	}
	public void salvarIdade(ArrayList<Pessoa> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			
			for (Pessoa p : linhas) {
				bw.write(p.calcIdade()+"\r\n");
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
