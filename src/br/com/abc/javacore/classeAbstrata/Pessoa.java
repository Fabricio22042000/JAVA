package br.com.abc.javacore.classeAbstrata;

public abstract class Pessoa implements Iimprimme {
	private String nome;

	
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
