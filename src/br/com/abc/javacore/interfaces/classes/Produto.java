package br.com.abc.javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double preco;
	private double peso;
	private double valorFinal;
	private double valorFrete;
	
	
	
	public Produto(String nome, double preco, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", peso=" + peso + ", valorFinal=" + valorFinal
				+ ", valorFrete=" + valorFrete + "]";
	}

	@Override
	public void calculaPreco() {
		this.valorFinal = this.preco + (this.preco * Produto.IMPOSTO);
	}
	@Override
	public void calculaFrete() {
		this.valorFrete = this.preco / this.peso * 0.05;
	}
	
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
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
	public double getValorFinal() {
		return valorFinal;
	}
	public double getValorFrete() {
		return valorFrete;
	}
}
