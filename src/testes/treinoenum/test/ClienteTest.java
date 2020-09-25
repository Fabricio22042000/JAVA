package testes.treinoenum.test;

import testes.treinoenum.classes.Cliente;
import testes.treinoenum.classes.tipoCliente;
import testes.treinoenum.classes.tipoPagamento;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fabricio", tipoCliente.PESSOA_FISICA, tipoPagamento.AVISTA);
		System.out.println(cliente);

	}

}
