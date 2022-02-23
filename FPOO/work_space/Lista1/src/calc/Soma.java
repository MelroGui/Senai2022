package calc;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, Result;
		
		System.out.print("Insira um valor inteiro: ");
		A = sc.nextInt();
		System.out.print("Insira outro valor inteiro: ");
		B = sc.nextInt();
		
		Result = A + B;
		
		System.out.println("O resultado da soma é " + Result);
	}
}
