package br.com.abc.javacore.serializazao.classe;


public class Turma {
	private String nome;

	@Override
	public String toString() {
		return "Turma [nome=" + nome + "]";
	}

	public Turma(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
