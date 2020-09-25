package testes.treinoenum.classes;



public class Cliente {
	private String nome;
	private tipoCliente tipoCliente;
	private tipoPagamento tipoPagamento;
	

	public Cliente(String nome, tipoCliente tipoCliente, tipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente.getTipoClienteNumero() + ", tipoPagamento=" + tipoPagamento + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public tipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public tipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	
}
