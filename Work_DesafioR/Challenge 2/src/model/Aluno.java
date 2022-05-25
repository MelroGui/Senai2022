package model;

public class Aluno {
	private String nome;
	private float nota, nota2, nota3;
	public Aluno(String entrada) {
		nome = entrada.split(";")[0];
		nota = Float.parseFloat(entrada.split(";")[1]);
		nota2 = Float.parseFloat(entrada.split(";")[2]);
		nota3 = Float.parseFloat(entrada.split(";")[3]);
	}
	public Aluno(){
	
	}
	public String calcMedia() {
	float media = (nota + nota2 + nota3) / 3;
	return String.format("%.1f", media);
	}
}
