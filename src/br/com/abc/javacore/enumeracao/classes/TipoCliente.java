package br.com.abc.javacore.enumeracao.classes;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa F�sica"), PESSOA_JURIDICA(2, "Pessoa Jur�dica");
	
	private int tipoEmNumero;
	private String nome;

	private TipoCliente(int tipoEmNumero, String nome) {
		this.tipoEmNumero = tipoEmNumero;
		this.nome = nome;
	}
	
	public int getTipoEmNumero() {
		return this.tipoEmNumero;
	}
	
	public String getTipoEmNome() {
		return this.nome;
	}
	
}
