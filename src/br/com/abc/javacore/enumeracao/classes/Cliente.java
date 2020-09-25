package br.com.abc.javacore.enumeracao.classes;

public class Cliente {
	public enum TipoPagamento{
		AVISTA, APRAZO;
	}
	
	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipoPagamento;

	
	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.tipoPagamento = tipoPagamento;
	}
	


	@Override
	public String toString() {
		return "Cliente [nome=" + this.nome + ", tipo=" + this.tipo.getTipoEmNome() + ", tipoPagamento=" + this.tipoPagamento + " TipoEmNúmero: " + tipo.getTipoEmNumero() + "]";
	}

	public TipoPagamento getTipoPagamento() {
		return this.tipoPagamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	
	
	
}
