package exemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

	public void escrever(String info, String fileName, boolean append) {
		
		try {
			FileWriter fw = new FileWriter(fileName + ".csv", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info+"\r\n");
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Erro geral."+ e);
		}
		
	
	}
	public ArrayList<String> ler(String fileName) {
		ArrayList<String> data = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName +".csv");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				data.add(linha);
				System.out.println(linha);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro de arquivo");
		} catch (Exception e) {
			System.out.println("Erro geral");
		}
		return data;
	}
}
