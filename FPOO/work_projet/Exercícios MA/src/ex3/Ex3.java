package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	
	private static Scanner sc = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	public static void main(String[] args) {
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Cadastrar Alunos\n2. Listar Alunos\n3. Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				listarAlunos();
				break;
			case 3:
				System.out.println("Vaza");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} 
	}
	private static void cadastrarAluno() {
		System.out.println("Digite o nome do aluno: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Digite a Primeira nota do aluno: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Digite a Segunda nota do aluno: ");
		float num2 = sc.nextFloat();
		
		System.out.println("Digite a Terceira nota do aluno: ");
		float num3 = sc.nextFloat();
		
		String data = nome + ";" + num1 + ";" + num2 + ";" + num3;
		
		arq.escrever(data, "Alunos", true);
		
		System.out.println("Aluno cadastrado com sucesso!\n\n");
	}
	
	private static void listarAlunos() {
		ArrayList<String> dados = arq.ler("Alunos");
		
		System.out.println("Nome\t\tMedia");
		
		for (String aluno : dados) {
			String[] temp = aluno.split(";");
			
			double media = (Double.parseDouble(temp[1]) + Double.parseDouble(temp[2]) + Double.parseDouble(temp[3])) / 3;
			
			System.out.printf("%s\t%.2f\n", temp[0], media);
		}
	}
}