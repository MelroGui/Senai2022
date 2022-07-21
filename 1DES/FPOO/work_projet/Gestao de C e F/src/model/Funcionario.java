
package model;

public class Funcionario extends Pessoa{

	private int matricula;
	private double comissao;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		return "\t[Matrícula\t\tNome\t\tTelefone\t\tNascimento\t\tComissão]";
	}
}