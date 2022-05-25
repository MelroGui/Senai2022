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
			sc.nextLine();
			switch (opcao) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				listarAlunos();
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
	private static void cadastrarAluno() {
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota do aluno: ");
		float nota3 = sc.nextFloat();
		
		String aluno = nome + ";" + nota1 + ";" + nota2 + ";" + nota3;
		arq.escrever(aluno, "Alunos", true);
		System.out.println("Aluno cadastrado com sucesso!");
	}
	private static void listarAlunos() {
		ArrayList<String> info = arq.ler("Alunos");
		for (String aluno : info) {
			String[] quebra = aluno.split(";");
			double media = (Float.parseFloat(quebra[1]) + Float.parseFloat(quebra[2]) + Float.parseFloat(quebra[3])) / 3;
			System.out.printf("|Aluno(a): %s|\t|Média %.1f|\n", quebra[0], media);
		}
	}
}
