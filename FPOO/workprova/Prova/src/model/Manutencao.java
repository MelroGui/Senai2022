package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Manutencao {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int id;
	private String data;
	private String equipamento;
	private double custoHora;
	private double tempoGasto;
	public Manutencao(int id, String data, String equipamento, double custoHora, double tempoGasto) {
		this.id = id;
		this.data = data;
		this.equipamento = equipamento;
		this.custoHora = custoHora;
		this.tempoGasto = tempoGasto;
	}
	public int getId() {
		return id;
	}
	public String getId(String S) {
		return String.format("%d", id);
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	public String getCustoHora(String S) {
		return String.format("%.0f", custoHora);
	}
	public void setCustoHora(double custoHora) {
		this.custoHora = custoHora;
	}
	public double getTempoGasto() {
		return tempoGasto;
	}
	public String getTempoGasto(String S) {
		return String.format("%.2f", tempoGasto);
	}
	public void setTempoGasto(double tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(custoHora, data, equipamento, id, tempoGasto);
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
		return Double.doubleToLongBits(custoHora) == Double.doubleToLongBits(other.custoHora)
				&& Objects.equals(data, other.data) && Objects.equals(equipamento, other.equipamento) && id == other.id
				&& Double.doubleToLongBits(tempoGasto) == Double.doubleToLongBits(other.tempoGasto);
	}
	
	public double getTotal() {
		return getCustoHora() * getTempoGasto();
	}
	@Override
	public String toString() {
		return id + "\t" + data + "\t" + equipamento + "\t"
				+ custoHora + "\t" + tempoGasto + "\t" + String.format("%.2f", getTotal());
	}
	
	public String toCSV() {
		return id + ";" + data + ";" + equipamento + ";"
				+ custoHora + ";" + tempoGasto + ";";
	}
	public Manutencao(String linha) {
		String[] temp = linha.split(";");
		this.id = Integer.parseInt(linha.split(";")[0]);
		this.data = linha.split(";")[1];
		this.equipamento = linha.split(";")[2];
		this.custoHora = Double.parseDouble(linha.split(";")[3]);
		this.tempoGasto = Double.parseDouble(linha.split(";")[4]);
	}
}