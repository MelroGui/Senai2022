package model;

public class Prato {
	public int codPrato;
	public String nome, tipo, descricao;
	public float preco;
	
	public Prato(){}

	public Prato(int codPrato, String nome, String tipo, String descricao, float preco) {
		this.codPrato = codPrato;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\t[Cod\t\tNome\t\tTipo\t\t\tDescrição]\n"
				+"\t[" +codPrato+ "\t\t" +nome+ "\t" +tipo+ "\t\t\t " +descricao+ "]\n\n" 
				+"\tPreço: R$"+preco+"\n";
	}
}
