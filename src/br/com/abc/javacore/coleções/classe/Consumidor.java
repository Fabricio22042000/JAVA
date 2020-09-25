package br.com.abc.javacore.coleções.classe;


public class Consumidor implements Comparable<Consumidor> {
	private String nome;
	private String cpf;

	public Consumidor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public int compareTo(Consumidor o) {
		// -1 para adicionar
		// 0 para não adicionar
		if(this.nome.equals(o.getNome())) {
			return -1;
		}
		return this.nome.compareTo(o.getNome());
	}

	@Override
	public int hashCode() {
		return this.cpf != null ? this.cpf.hashCode() : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return this.cpf != null ? this.cpf.equals(other.getCpf()) : false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
