package model;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class aleatorios {
	
	public static Scanner sc;
	
	public static void main(String[] args)throws IOException {
		sc = new Scanner(System.in);
		int menu = 0;
		
		while(menu !=4) {
			System.out.println("1 - Numeros Inteiros\n2 - Numeros Reais"
								+ "\n3 - Nomes\n4 - Sair");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				GerarInteiro();
				break;
			case 2:
				GerarInteiro();
				break;
			case 3:
				break;
			case 4:
				System.out.print("Obrigado!");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
				
			}
			
		}
		
	}

	public static void GerarInteiro() {
		sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos numeros deseja gerar: ");
		int qntd = sc.nextInt();
		
		double[] numeros = new double[qntd];
		
		int[] numeros = new int[qntd];
		
		for(int i = 0; i < qntd ; i++) {
			numeros[i] = sc.nextDouble() * 100;
			System.out.printf("%.2f\n", numeros[i]);
		
		public static void GerarNomes() {
			sc = new Scanner(System.in);
			Random rand = new Random();
			
			System.out.println("Digite nomes apenas");
			int qntd = sc.nextInt();
			
			String[] nomes = ("AMONGUS", "bRUNOGUEI", "GAYBRIEL", "MATUECARECA", "THEROCK", "ROBERTOJUSTOS", "ANACRARA", "ENZO", "BONORO", "EDUARDOGADO");
			
			for(int i = 0; i < qntd; i++);
			    int a = sc.nextInt(nomes.length);
			    System.out.println(nomes[a]);
			
		}
		}
		
}
}