package model;

public class Gato extends Animal{
	private int vidas;

	public Gato(String nome, String raca, float peso, int vidas) {
		super(nome, raca, peso);
		this.vidas = vidas;
	}
	public String perderVidas(){
		int rVidas = 7 - vidas;
		if(rVidas <= 0){
			return "Gato Morreu._.";
		}else {
			return "Tem "+rVidas+" restante"; 
		}
	}

	@Override
	public String toString() {
		return super.toString()+"\n\t\t|Vidas"+perderVidas()+"|";
	}
	
	
}