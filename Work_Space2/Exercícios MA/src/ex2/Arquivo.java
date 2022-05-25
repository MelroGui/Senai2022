package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

	public void escrever(ArrayList<Integer> info, String fileName, boolean append) {
		try {
			FileWriter fw = new FileWriter(fileName + ".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (Integer num : info) {
				bw.write(num.intValue() + "\r\n");
			}
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Erro Geral");
		}
	}
	public ArrayList<Integer> ler (String fileName){
		ArrayList<Integer> numero = new ArrayList<Integer>();
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				numero.add(Integer.parseInt(linha));
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
		return numero;
	}
}
