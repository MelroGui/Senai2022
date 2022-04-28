package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date nascimento;
	SimpleDateFormat df = new SimpleDateFormat("yyyy");
	
	public Pessoa(String entrada) throws ParseException{
		nome = entrada.split(";")[0];
		nascimento = df.parse(entrada.split(";")[1]);
	}
	public Pessoa(){
		
	}
	
	public int calcIdade() {
		Date hoje = new Date();
		@SuppressWarnings("deprecation")
		int idade = hoje.getYear() - nascimento.getYear();
		return idade;
	}
}
