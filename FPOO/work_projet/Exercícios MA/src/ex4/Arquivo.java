package ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

	public void escrever(String info) {
		try {
			FileWriter fw = new FileWriter("Usuarios.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info+"\n");
			
			bw.close();
			fw.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public ArrayList<String> ler(){
		ArrayList<String> usuario = new ArrayList<>();
		try {
			FileReader fr = new FileReader("Usuarios.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				usuario.add(linha);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Arquivo está aberto");
		} catch (Exception e) {
			System.out.println("Erro geral");
		}
		return usuario;
	}
}
