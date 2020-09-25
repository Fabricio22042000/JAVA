package br.com.abc.javacore.coleções.classe;

public class Produto implements Comparable<Produto> {
	private String serialNumber;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String serialNumber, String nome, double preco) {
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String serialNumber, String nome, double preco, int quantidade) {
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

	public int compareTo(Produto outroObj) {
		//o1.preco.compareTo(o2.preco);
		//se o1 > o2 = return 1;
		//se o1 < o2 = return -1;
		//se o1 == o2 = return 0;
		return Double.valueOf(this.preco).compareTo(outroObj.getPreco());
	}

	@Override
	public int hashCode() {
		return this.serialNumber != null ? this.serialNumber.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return this.serialNumber != null ? this.serialNumber.equals(other.getSerialNumber()) : false;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
