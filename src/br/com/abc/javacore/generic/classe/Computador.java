package br.com.abc.javacore.generic.classe;

public class Computador {
	private String marca;

	public Computador(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
