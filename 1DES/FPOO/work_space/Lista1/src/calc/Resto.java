package calc;

import java.util.Scanner;

public class Resto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resto, A, B;
		
		System.out.print("Insira insira um primeiro valor: ");
		A = sc.nextInt();
		System.out.print("Insira um segundo valor, diferente de 0: ");
		B = sc.nextInt();
		
		resto = A % B;
		
		System.out.println("O resto da divisão é de " + resto);
	}
}
