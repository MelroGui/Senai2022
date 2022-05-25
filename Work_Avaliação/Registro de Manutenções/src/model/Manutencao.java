package model;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Manutencao {
	private int id;
	private Date dataManu;
	private String equipamento;
	private double custoHora, tempoGasto;
	private SimpleDateFormat df = new SimpleDateFormat("dd/MM;yyyy");
	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat decf = new DecimalFormat("#.00");
	
	public Manutencao(int id, String dataManu, String equipamento, double custoHora, double tempoGasto) {
		this.id = id;
		try {
			this.dataManu = df.parse(dataManu);
		} catch (ParseException e) {
			System.out.println(e);;
		}
		this.equipamento = equipamento;
		this.custoHora = custoHora;
		this.tempoGasto = tempoGasto;
	}
	
	public Manutencao(int id) {
		this.id = id;
	}

	public Manutencao(String linha) {
		decf.setCurrency(Currency.getInstance(BRASIL));
		
		this.id = Integer.parseInt(linha.split(";")[0]);
		try {
			this.dataManu = df.parse(linha.split(";")[1]);
			this.custoHora = (double) decf.parse(linha.split(";")[3].toString());
			this.tempoGasto = (double) decf.parse(linha.split(";")[4].toString());
		} catch (ParseException e) {
			System.out.println(e);
		}
		this.equipamento = linha.split(";")[2];
		
	}

	public int getId() {
		return id;
	}
	
	public String getId(String s) {
		return String.format("%d", id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataManu() {
		return dataManu;
	}

	public String getDataManu(String s) {
		return df.format(dataManu);
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public double getCustoHora() {
		return custoHora;
	}
	
	public String getCustoHora(String s) {
		return String.format("%.2f", custoHora);
	}

	public void setCustoHora(double custoHora) {
		this.custoHora = custoHora;
	}

	public double getTempoGasto() {
		return tempoGasto;
	}
	
	public String getTempoGasto(String s) {
		return String.format("%.2f", tempoGasto);
	}

	public void setTempoGasto(double tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	
	public String getTotal(String s) {
		double total = custoHora * tempoGasto;
		return String.format("%.2f", total);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manutencao other = (Manutencao) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return id + "\t" + df.format(dataManu) + "\t" + equipamento + "\t"
				+ String.format("%.2f", custoHora) + "\t" + String.format("%.2f", tempoGasto) + getTotal("s") +"\t";
	}
	
	public String toCSV() {
		return id + ";" +df.format(dataManu)+ ";" +equipamento+ ";"
				+custoHora+ ";" + tempoGasto +"\r\n";
	}
}
