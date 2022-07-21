package model;
import java.util.Scanner;
public class Lacosderepeticao {	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		int menu = 0;		
		while(menu != 3) {
						System.out.println("1.ParesE\n2.ImparesE\n3.MaiorMenor\n4.Fatorial\n5.Tabela");
			menu = sc.nextInt();
			switch(menu) {		
			case 1:
				System.out.println("Informe o inicio do intervalo : ");
				int inicio = sc.nextInt();				
				System.out.println("Informe o fim do intervalo : ");
				int fim = sc.nextInt();				
				if(inicio%2 != 0) inicio++;				
				for(int i = inicio; i <= fim; i+=2) {
					System.out.println(i);
				}
			break;
			case 2: 				
				break;
			case 3:
				int maior = 0, menor = 0, val;			
				for(int i = 0; i < 10; i++) {
					System.out.println("Informe um valor qualquer:");
					val = sc.nextInt();				
					if(i == 0) {
						maior = val;
						menor = val;
					}else {
						if(val > maior) maior = val;
						if(val < menor) menor = val;
					}
				}			
				System.out.println(maior);
				System.out.println(menor);				
				break;
			case 4:
				System.out.println("Informe o valor a ser calculado : ");
				int valo = sc.nextInt();				
				int fat = 1;				
				for(int i = valo; i >= 1; i--) {
					fat = fat * i;
					//fat *= i;
				}				
				System.out.println(fat);
				break;
			case 5:	
				System.out.println("Informe o valor da copia : ");
				float valor = sc.nextFloat();				
				int cont = 0;				
				for(int i = 1; i <= 200; i++) {
					System.out.printf("%d = %.2f\t", i, (valor * i));
					cont++;
					if(cont == 10) {
						cont = 0;
						System.out.println();
					}
				}
				break;
			case 6: 
				System.out.println("Informe o inicio da sequencia : ");
				int ini = sc.nextInt();
				System.out.println("Informe o fim da sequencia : ");
				int f = sc.nextInt();	
				int somapar = 0, somaimpar = 0;	
				for(int i = ini; i <= f; i++) {
					if(i%2 == 0) {
						somapar = somapar + i;
					}else {
						somaimpar = somaimpar + i;
					}
				}				
				System.out.println(somapar);
				System.out.println(somaimpar);				
				break;
			default:
				System.out.println("Ta de brincation with me.");
			}
		}
	}
}