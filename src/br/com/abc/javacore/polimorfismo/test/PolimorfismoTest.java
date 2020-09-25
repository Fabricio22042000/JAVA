package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classe.Gerente;
import br.com.abc.javacore.polimorfismo.classe.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classe.Vendedor;
public class PolimorfismoTest {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Fabricio", 5000, 2000);
		Vendedor v = new Vendedor("Rodolfo", 2000, 20000);
		
		RelatorioPagamento relatorio = new RelatorioPagamento();

		relatorio.relatorioPagamentoGenerico(g);
		System.out.println("---------------------");
		relatorio.relatorioPagamentoGenerico(v);
	}

}
