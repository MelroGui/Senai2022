package model;

public class Cao extends Animal {
	private int motos = 0;
	
	public Cao(String nome, String raca, float peso, int motos) {
		super(nome, raca, peso);
		this.motos = motos;
	}

	public int assustarMotoqueiros() {
		this.motos++;
		return motos;
	}

	@Override
	public String toString() {
		return super.toString()+"\n\t\t"+assustarMotoqueiros();
	}
}