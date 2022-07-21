package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DAO {

	private BufferedReader br;
	private BufferedWriter bw;
	private String path =  "./dados/registro.csv";
	
	public ArrayList<Manutencao> ler(){
		ArrayList<Manutencao> linhas = new ArrayList<Manutencao>();
		Manutencao manutencao;
		
		try {
			br = new BufferedReader(new FileReader(path));
			String linha = br.readLine();
			while (linha != null) {
				manutencao = new Manutencao(linha);
				linhas.add(manutencao);
				linha = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public void escrever(ArrayList<Manutencao> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(path));
			
			for (Manutencao manu : linhas) {
				bw.write(manu.toCSV() + "\r\n");
			}
			
			
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}	
	}
}