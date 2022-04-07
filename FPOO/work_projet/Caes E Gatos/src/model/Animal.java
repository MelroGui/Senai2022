package model;

public class Animal {
	private String nome, raca;
	private float peso;
	
	public Animal(String nome, String raca, float peso) {
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "\n[Nome\t\tRaça\t\tPeso]\n"+
				"\t\t" +nome+ "\t\t" +raca+ "\t\t" +peso;
	}
}