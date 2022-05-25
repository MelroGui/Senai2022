package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MainMenu {

	static String entrada = "D:\\Gabriel\\Senai2022\\FPOO\\Work_DesafioR\\Challenge 3\\bd\\numeros.txt";
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Criar/Recriar arquivo\n2. Listar Números\n3. Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				criarArq();
				break;
			case 2:
				listarNums();
				break;
			case 3:
				System.out.println("Flw meu Nobre");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} 
	}
	public static void escrever(ArrayList<Integer> info, boolean append) {
		try {
			FileWriter fw = new FileWriter(entrada, append);
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
	public static ArrayList<Integer> ler (){
		ArrayList<Integer> numero = new ArrayList<Integer>();
		try {
			FileReader fr = new FileReader(entrada);
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
	private static void criarArq() {
		System.out.println("Digite a quantidade de números que deseja gerar: ");
		int size = sc.nextInt();
		System.out.println("Quer gerar "+size+" números Entre 0 e ?(Digite o tamanho do intervalo)");
		int size2 = sc.nextInt();
		
		Random rand = new Random();
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		for(int i = 0; i < size; i++) {
			numeros.add(rand.nextInt(size2)); 
		}
		escrever(numeros, false);
		System.out.println("Arquivo criado com sucesso!");
	}
	private static void listarNums() {
		ArrayList<Integer> info = ler();
		info.sort(null);
		Collections.sort(info);
		for (Integer num : info) {
			System.out.println(num);
		}
	}
}