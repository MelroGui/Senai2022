package calc;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a, b, c, resultado;
		
		System.out.print("Insira a variavel A: ");
		a = sc.nextFloat();
		System.out.print("Insira a variavel B: ");
		b = sc.nextFloat();
		System.out.print("Insira a variavel C: ");
		c = sc.nextFloat();
		
		resultado = (a + b) / c;
		
		System.out.printf("O resultado é %.2f", resultado);
	}
}
