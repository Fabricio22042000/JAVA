package br.com.abc.javacore.generic.classe;

public class Carro {
	private String modelo;

	public Carro(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
