package model;

import java.util.Scanner;

public class Prato {

	public int codigoPrato;
	public String nome;
	public String tipo;
	public String descricao;
	public float preco;
	

	public void Prato() {}


	public Prato(int codigoPrato, String nome, String tipo, String descricao, float preco) {
		this.codigoPrato = codigoPrato;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "\t[Codigo\t\tNome\t\tTipo\t\tDescrição\t\tPreço]\n"
				+"\t["+codigoPrato+ "\t\t" +nome+ "\t\t" + tipo + "\t\t" + descricao + "\t\t" + preco+"]\n";
	}
}
