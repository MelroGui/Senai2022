package exercicios;

import java.util.Scanner;

public class IRRF {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double salario, desc, percen;
		
		System.out.print("Digite seu salario: ");
		salario = sc.nextDouble();
		
		if (salario > 4664.68) {
			percen = 27.5;
			desc = salario * (percen/100);
		} else if (salario > 3751.06) {
			percen = 22.5;
			desc = salario * (percen/100);
		}else if (salario > 2826.66) {
			percen = 15;
			desc = salario * (percen/100);
		} else if (salario > 1903.99) {
			percen = 7.5;
			desc = salario * (percen/100);
		} else {
			percen = 0;
			desc = 0;
		}
		
		System.out.printf("foi descontado %.1f%%, totalizando R$%.2f",percen, desc);
	
	}
}
