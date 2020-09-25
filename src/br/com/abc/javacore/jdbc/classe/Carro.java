package br.com.abc.javacore.jdbc.classe;

public class Carro {
	private Integer id;
	private String placa;
	private String nome;
	private Comprador comprador;

	public Carro() {
	}

	public Carro(String placa, String nome) {
		this.placa = placa;
		this.nome = nome;
	}

	public Carro(Integer id, String placa, String nome) {
		this.id = id;
		this.placa = placa;
		this.nome = nome;
	}

	public Carro(String placa, String nome, Comprador comprador) {
		this.placa = placa;
		this.nome = nome;
		this.comprador = comprador;
	}

	public Carro(Integer id, String placa, String nome, Comprador comprador) {
		this.id = id;
		this.placa = placa;
		this.nome = nome;
		this.comprador = comprador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return this.placa != null ? this.placa.equals(other.getPlaca()) : false;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", placa=" + placa + ", nome=" + nome + ", comprador=" + comprador + "]";
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
