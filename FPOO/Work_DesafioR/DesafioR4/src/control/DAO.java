package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Usuario;

public class DAO {
	private BufferedReader br;
	private String entrada = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 4\\dados\\usuarios.csv";
	
	public ArrayList<Usuario> abrir(){
		ArrayList<Usuario> linhas = new ArrayList<>();
		Usuario u;
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String linha = br.readLine();
			while(linha != null) {
				u = new Usuario(linha);
				linhas.add(u);
				linha = br.readLine();
			}
			
			br.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado " + e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto " + e);
		}
		return linhas;
	}
}
