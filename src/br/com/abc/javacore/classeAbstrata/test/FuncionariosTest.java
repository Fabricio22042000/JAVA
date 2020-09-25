package br.com.abc.javacore.classeAbstrata.test;

import br.com.abc.javacore.classeAbstrata.Gerente;
import br.com.abc.javacore.classeAbstrata.Vendedor;

public class FuncionariosTest {

	public static void main(String[] args) {
		Gerente g = new Gerente("Fabricio", "12123-4", 5000);
		
		Vendedor v1 = new Vendedor("Rodolfo", "56784-6", 2000, 5000);
		Vendedor v2 = new Vendedor("Raphaela", "77763-9", 2000, 2000);
		g.calculaSalario();
		v1.calculaSalario();
		v2.calculaSalario();

	}

}
