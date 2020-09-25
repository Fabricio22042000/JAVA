package testes.treinoenum.classes;

public enum tipoCliente {
	PESSOA_FISICA(1), PESSOA_JURIDICA(2);

	private int tipoClienteNumero;
	
	tipoCliente(int i) {
		this.tipoClienteNumero = i;
	}
	
	public int getTipoClienteNumero() {
		return tipoClienteNumero;
	}

	
	
	
	
}
