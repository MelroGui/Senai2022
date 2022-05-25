package ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		int idade;
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Cadastrar Pessoa\n2. Listar Pessoas\n3. Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
			case 1:
				System.out.println("Digite o Nome: ");
				String nome = sc.nextLine();
				System.out.println("Digite a data de nascimento: ");
				String dataN = sc.next();
				
				String pessoa = nome+ ": " +dataN;
				cad.cadastrar(pessoa, "Pessoa", true);
				System.out.println("Pessoa cadastrado com sucesso!");
				break;
			case 2:
				ArrayList<String> infoFile = cad.listar("Pessoa");
				for(String linha : infoFile) {
					String[] indice = linha.split(":");
					System.out.print("|Nome: "+indice[0]+"|\t");
					
					Date nasc = df.parse(indice[1]);
					
					java.util.Date hoje = new java.util.Date(); 
					if(hoje.getMonth() == nasc.getMonth()) {
						if(hoje.getDay() > nasc.getDay()) {
							idade = hoje.getYear() - nasc.getYear();
						} else{
							idade = hoje.getYear() - nasc.getYear() - 1;
						}
					}else if(hoje.getMonth() > nasc.getMonth()) {
						idade = hoje.getYear() - nasc.getYear();
					}else{
						idade = hoje.getYear() - nasc.getYear() - 1;
					}
					
					System.out.println("|Idade: "+idade+" Anos|");
				}
				break;
			case 3:
				System.out.println("Flw!");
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
