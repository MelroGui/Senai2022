package model;

public class Nota {
	
	public String componente;
	public float[] nota =  new float[3];
	
	public Nota(){}
	
	public Nota(String componente, float[] nota) {
		this.componente = componente;
		this.nota = nota;
	}
	public float obterMedia() {
		float mediaS = 0;
		for (int i = 0; i < nota.length; i++) {
			mediaS += nota[i];
		}
		return mediaS/nota.length;
	}
}
