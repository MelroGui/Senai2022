package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Funcionario;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	private static Cliente cliente;
	private static Funcionario funcionario;
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static int indice;

	public static void main(String[] args) throws ParseException {

		int menu = 0;
		while (menu != 5) {
			opcoes();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				deletar();
				break;
			case 5:
				System.out.println("VAZA NOIA");
				break;
			default:
				System.out.println("Opção Inválida.\n");
			}
		}
	}

	private static void cadastrar() throws ParseException {
		String nasc;
		int subMenu = 0;
		while (subMenu != 3) {
			System.out.println("\t1. |Cadastrar Cliente|\n\t2. |Cadastrar Funcionário|\n\t3. Sair");
			subMenu = sc.nextInt();
			switch (subMenu) {
			case 1:
				cliente = new Cliente();
				System.out.println("\t|Informe os dados do Cliente|");
				System.out.println("\tDigite o Id: ");
				cliente.setId(sc.nextInt());
				System.out.println("\tDigite o Nome: ");
				cliente.setNome(sc.next());
				System.out.println("\tDigite o Telefone: ");
				cliente.setTelefone(sc.next());
				System.out.println("\tDigite a Data de Nascimento: ");
				nasc = sc.next();
				cliente.setNascimento(df.parse(nasc));
				System.out.println("\tDigite o saldo da conta: ");
				cliente.setCreditoLimite(sc.nextDouble());
				clientes.add(cliente);
				System.out.println("\tCliente cadastrado com sucesso!\n");
				break;
			case 2:
				funcionario = new Funcionario();
				System.out.println("\t|Informe os dados do Funcionario|");
				System.out.println("\tDigite a matrícula(vulgo ID) do Funcionário: ");
				funcionario.setMatricula(sc.nextInt());
				System.out.println("\tDigite o Nome: ");
				funcionario.setNome(sc.next());
				System.out.println("\tDigite o Telefone: ");
				funcionario.setTelefone(sc.next());
				System.out.println("\tDigite a Data de Nascimento: ");
				nasc = sc.next();
				funcionario.setNascimento(df.parse(nasc));
				System.out.println("\tDigite a comissão do funcionário: ");
				funcionario.setComissao(sc.nextDouble());
				funcionarios.add(funcionario);
				System.out.println("\tFuncionário cadastrado com sucesso!\n");
				break;
			case 3:
				System.out.println("\tVoltando pro menu principal\n");
				break;
			default:
				System.out.println("\tOpção Inválida.\n");
			}
		}
	}

	private static void listar() {
		int subMenu2 = 0;
		while (subMenu2 != 3) {
			System.out.println("\t1. |Listar Clientes|\n\t2. |Listar Funcionários|\n\t3. Sair");
			subMenu2 = sc.nextInt();
			switch (subMenu2) {
			case 1:
					for(Cliente c : clientes) {
						System.out.println(c.toString());
						System.out.print("\t["+c.getId()+"\t\t");
						System.out.print(c.getNome()+"\t\t");
						System.out.print(c.getTelefone()+"\t\t");
						System.out.print(df.format(c.getNascimento())+"\t\t");
						System.out.println(c.getCreditoLimite()+"]\n");
					
					}
					if(clientes.size() ==  0){
						System.out.println("\tLista de clientes vazia.\n");
					}
				break;
			case 2:
					for(Funcionario f : funcionarios) {
						System.out.println(f.toString());
						System.out.print("\t["+f.getMatricula()+"\t\t");
						System.out.print(f.getNome()+"\t\t");
						System.out.print(f.getTelefone()+"\t\t");
						System.out.print(df.format(f.getNascimento())+"\t\t");
						System.out.println(f.getComissao()+"]\n");
					}
				if(funcionarios.size() ==  0){
					System.out.println("\tLista de funcionários vazia.\n");
				}
				break;
			case 3:
				System.out.println("\tVoltando pro menu principal\n");
				break;
			default:
				System.out.println("\tOpção Inválida.\n");
			}
		}
	}
	private static void alterar() throws ParseException{
		String nasc;
		int subMenu3 = 0;
		while (subMenu3 != 3) {
			System.out.println("\t1. |Alterar Cliente|\n\t2. |Alterar Funcionário|\n\t3. Sair");
			subMenu3 = sc.nextInt();
			switch (subMenu3) {
			case 1:
				System.out.println("\tDigite o índice(posição)");
				indice = sc.nextInt();
				clientes.remove(indice);
				cliente = new Cliente();
				System.out.println("\t|Informe as informações do Cliente|");
				System.out.println("\tDigite o Id: ");
				cliente.setId(sc.nextInt());
				System.out.println("\tDigite o Nome: ");
				cliente.setNome(sc.next());
				System.out.println("\tDigite o Telefone: ");
				cliente.setTelefone(sc.next());
				System.out.println("\tDigite a Data de Nascimento: ");
				nasc = sc.next();
				cliente.setNascimento(df.parse(nasc));
				System.out.println("\tDigite o saldo da conta: ");
				cliente.setCreditoLimite(sc.nextDouble());
				clientes.add(indice, cliente);
				System.out.println("\tCliente alterado com sucesso!\n");
				break;
			case 2:
				System.out.println("\tDigite o índice(posição)");
				indice = sc.nextInt();
				funcionarios.remove(indice);
				funcionario = new Funcionario();
				System.out.println("\t|Informe as informações do Funcionario|");
				System.out.println("\tDigite a matrícula(vulgo ID) do Funcionário: ");
				funcionario.setMatricula(sc.nextInt());
				System.out.println("\tDigite o Nome: ");
				funcionario.setNome(sc.next());
				System.out.println("\tDigite o Telefone: ");
				funcionario.setTelefone(sc.next());
				System.out.println("\tDigite a Data de Nascimento: ");
				nasc = sc.next();
				funcionario.setNascimento(df.parse(nasc));
				System.out.println("\tDigite a comissão do funcionário: ");
				funcionario.setComissao(sc.nextDouble());
				funcionarios.add(indice, funcionario);
				System.out.println("\tFuncionário alterado com sucesso!\n");
				break;
			case 3:
				System.out.println("\tVoltando pro menu principal\n");
				break;
			default:
				System.out.println("\tOpção Inválida.\n");
			}
		}
	}

	private static void deletar() {
		int op;
		int subMenu4 = 0;
		while (subMenu4 != 4) {
			System.out.println("\t1. |Deletar Cliente|\n\t2. |Deletar Funcionário|\n\t3. |Deletar Todos|\n\t4. Sair");
			subMenu4 = sc.nextInt();
			switch (subMenu4) {
			case 1:
				System.out.println("\t\t1. |Deletar só um cliente|\n\t\t2. |Deletar todos os clientes|\n\t\t3. Sair");
				op = sc.nextInt();
				if(op == 1) {
					System.out.println("\t\tDigite o índice(posição) do cliente na lista: ");
					indice = sc.nextInt();
					clientes.remove(indice);
					System.out.println("\t\tCliente removido com sucesso!");
				} else if(op == 2) {
					clientes.clear();
					System.out.println("\t\tLista de clientes deletada com sucesso");
				}
				else if(op == 3){
					System.out.println("\t\tVoltando ao SubMenu");
					break;
				}else {
					System.out.println("\t\tOpção Inválida.");
				}
				break;
			case 2:
				System.out.println("\t\t1. |Deletar só um funcionário|\n\t\t2. |Deletar todos os funcionários|\n\t\t3. Sair");
				op = sc.nextInt();
				if(op == 1) {
					System.out.println("\t\tDigite o índice(posição) do funcionário na lista: ");
					indice = sc.nextInt();
					funcionarios.remove(indice);
					System.out.println("\t\tFuncionário removido com sucesso!");
				} else if(op == 2) {
					funcionarios.clear();
					System.out.println("\t\tLista de funcionários deletada com sucesso");
				}
				else if(op == 3){
					System.out.println("\t\tVoltando ao SubMenu");
					break;
				}else {
					System.out.println("\t\tOpção Inválida.");
				}
				break;
			case 3:
				clientes.clear();
				funcionarios.clear();
				System.out.println("\tTodos foram deletados.");
				break;
			case 4:
				System.out.println("\tVoltando pro menu principal\n");
				break;
			default:
				System.out.println("\tOpção Inválida.\n");
			}
		}
	}

	public static void opcoes() {
		String[] opcoes = new String[5];
		opcoes[0] = "1. |Cadastrar Uma Pessoa|";
		opcoes[1] = "2. |Listar Uma Pessoa|";
		opcoes[2] = "3. |Alterar Uma Pessoal|";
		opcoes[3] = "4. |Deletar Uma Pessoa|";
		opcoes[4] = "5. Sair";

		for (int i = 0; i < opcoes.length; i++) {
			System.out.println(opcoes[i]);
		}
	}
}