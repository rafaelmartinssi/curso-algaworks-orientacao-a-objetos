package date.modelo;

import java.time.Year;

public class Carro {

	private String modelo;
	private double valorDiaria;
	private Year ano;
	
	public Carro(String modelo, double valorDiaria, Year ano) {
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Year getAno() {
		return ano;
	}

	public void setAno(Year ano) {
		this.ano = ano;
	}
}
