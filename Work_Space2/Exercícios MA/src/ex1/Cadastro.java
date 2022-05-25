package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Cadastro {
	
	public void cadastrar(String info, String fileName, boolean append) {
		try {
			FileWriter fw = new FileWriter(fileName + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info+"\r\n");
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Erro geral."+ e);
		}
	}
	public ArrayList<String> listar(String fileName) {
		ArrayList<String> pessoa = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName +".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				pessoa.add(linha);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado."+ e);
		} catch (IOException e) {
			System.out.println("Arquivo está aberto"+ e);
		} catch (Exception e) {
			System.out.println("Erro geral" + e);
		}
		return pessoa;
	}
}
