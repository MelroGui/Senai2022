package model;

import java.util.Scanner;

public class INSS {
	public static Scanner sc;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double salario, desconto;
		float porcentagem;
		
		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		if(salario > 7087.22) {
			porcentagem = 0f;
		}else if(salario > 3641.03) {
			porcentagem = 14f;
		}else if(salario > 2427.35){
			porcentagem = 12f;
		}else if(salario > 1212.01){
			porcentagem = 9f;
		} else {
			porcentagem = 7.5f;		
		}
		
		if(porcentagem == 0f)
			desconto = 992.21;
		else
			desconto = salario * porcentagem / 100;	

		System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagem);
		System.out.printf("O desconto de INSS é %.2f\n",desconto);
		System.out.printf("Você vai receber %.2f\n",salario  - desconto);
	}
}