package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	private int idF;
	private String nome, funcao;
	private double valorHora, cargaHoraria;
	private Date dataNascimento;
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public Funcionario(int idF, String nome, String funcao, double valorHora, double cargaHoraria,
			Date dataNascimento) {
		super();
		this.idF = idF;
		this.nome = nome;
		this.funcao = funcao;
		this.valorHora = valorHora;
		this.cargaHoraria = cargaHoraria;
		this.dataNascimento = dataNascimento;
	}
	
	
}
