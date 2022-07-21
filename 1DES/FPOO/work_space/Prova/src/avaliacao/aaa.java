package avaliacao;

import java.util.Scanner;

public class aaa {
	public static Scanner sc; 
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		double salario, desconto, porcentagem;
		int  opcao = 0;		
		String nome;
			
		System.out.println("Digite seu nome completo por favor: ");
		nome = sc.nextLine();
		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		while(opcao != 4) {	
			
		System.out.println("Digite uma opcão:");
		System.out.println("1-Programa1\t2-Progama2\t3-Programa3\t4-Progama4");
		opcao = sc.nextInt();
		switch(opcao) {
		 	case 1: 
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
					
				System.out.printf("Esse é o seu INSS senhor", nome);
				System.out.printf("A alíquota aplicada é %.2f%% \n",porcentagem);
				System.out.printf("O desconto de INSS é %.2f\n",desconto);
				System.out.printf("Você vai receber %.2f\n",salario  - desconto);
					
				    
				break;
			case 2: 
				if (salario > 4664.68) {
					porcentagem =  27.5;
					desconto = salario * (porcentagem/100);
				} else if (salario > 3751.06) {
					porcentagem =  22.5;
					desconto = salario * (porcentagem/100);
				}else if (salario > 2826.66) {
					porcentagem = 15;
					desconto = salario * (porcentagem/100);
				} else if (salario > 1903.99) {
					porcentagem = 7.5;
					desconto = salario * (porcentagem/100);
				} else {
					porcentagem = 0;
					desconto = 0;
				}
				
				System.out.println("Esse é o seu IRRF senhor \n"+ nome);
				System.out.printf("foi descontado %.1f%%, totalizando R$%.2f",porcentagem, desconto);
				    
				break;
			case 3:
					double porcent;
					porcentagem = 0.08;
					desconto = salario * porcentagem;
					System.out.printf("foi descontado R$%.2f\n", desconto);
 				break;
			case 4: 
				System.out.println("Senhor \n"+ nome );	
				break;
			default :
				System.out.println("Essa opção é invalida por favor selecione uma das opções entre 1 e 4");			
				break;	

			}
		}
	}
}