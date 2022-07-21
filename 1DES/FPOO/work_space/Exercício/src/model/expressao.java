package model;

import java.util.Scanner;
	public class expressao {
	
	public static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int a, b, c, delta, r1, r2;
		
		System.out.println("Coloque valor de A");
		a = sc.nextInt();
		System.out.println("Coloque valor de B");
		b = sc.nextInt();
		System.out.println("Coloque valor de C");
		c = sc.nextInt();
		System.out.println(a+"x² "+"+ "+b+"x "+ "+ "+c+ "0");
		
		delta = (b * b) - (4 * a * c);
		System.out.println("Delta é "+ delta);
		
		if (delta<0) {
		System.out.println("Não possui raízes reais");
		
		
		}
		else {
			
		r1 = (int)(-b + Math.sqrt(delta)) / (2 * a);
		r2 = (int)(-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("raíz 1 ="+ r1);
		System.out.println("raíz 2 ="+ r2);
		
		}
	}

}
