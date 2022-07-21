package modelo;

public class Veiculo {

	public String placa;
	public String marca;
	public String modelo;
	public String cor;
	public int anoModel;
	public int anoFabric;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa,String marca,String modelo,String cor,int anoModel,int anoFabric) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoModel = anoModel;
		this.anoFabric = anoFabric;
	}
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoModel="
				+ anoModel + ", anoFabric=" + anoFabric + "]";
	}
}
