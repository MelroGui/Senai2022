package model;

public class Cliente extends Pessoa{

	private int id;
	private double creditoLimite;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCreditoLimite() {
		return creditoLimite;
	}
	public void setCreditoLimite(double creditoLimite) {
		this.creditoLimite = creditoLimite;
	}
	
	@Override
	public String toString() {
		return "\t[Id\t\tNome\t\tTelefone\t\tNascimento\t\tSaldo]";
	}
}
