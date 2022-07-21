package model;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Carro {

public void escrever(String info, String FileName, boolean append) {

		try {
			FileWriter fw = new FileWriter(FileName + ".csv", append);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(info + "\r\n");

			bw.close();
			fw.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public ArrayList<String> ler (String FileName) {
		ArrayList<String> data = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(FileName + ".csv");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "\r\n";
			
			while((linha = br.readLine()) != null) {
				data.add(linha);
			}

			br.close();
			fr.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}	
		return data;
	}
}