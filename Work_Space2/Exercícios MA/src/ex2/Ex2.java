package ex2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	
	private static Scanner sc = new Scanner(System.in);
	private static Arquivo arq = new Arquivo();
	public static void main(String[] args) {
		
		int opcao = 0;
		while(opcao != 3) {
			System.out.println("\n1. Criar/Recriar arquivo\n2. Listar Pessoas\n3. Sair");
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
		arq.escrever(numeros, "Numeros", false);
		System.out.println("Arquivo criado com sucesso!");
	}
	private static void listarNums() {
		ArrayList<Integer> info = arq.ler("Numeros");
		info.sort(null);
		for (Integer num : info) {
			System.out.println(num);
		}
	}
	
}
