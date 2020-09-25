package br.com.abc.javacore.enumeracao.test;

import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fabricio", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
		System.out.println(cliente);
}
}