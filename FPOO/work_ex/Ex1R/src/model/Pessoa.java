package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class Pessoa {

	private String Nome;
	private Date nasc;
	SimpleDateFormat df = new  SimpleDateFormat("yyyy");
	
	public Pessoa(String entrada) throws ParseException {
		Nome = (entrada.split(";")[0]);
		nasc = df.parse(entrada.split(";")[1]);
	}
	public Pessoa() {
		
	}

	public int calcidade() {
		Date hoje = new Date();
		@SuppressWarnings("deprecation")
		int idade = hoje.getYear() - nasc.getYear();
		return idade;
	}
}