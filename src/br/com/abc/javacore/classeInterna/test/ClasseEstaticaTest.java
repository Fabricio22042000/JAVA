package br.com.abc.javacore.classeInterna.test;

import br.com.abc.javacore.classeInterna.test.Externa.Interna;

class Externa {
	private String nome = "Fabricio Moura";

	static class Interna {
		public void imprime() {
			System.out.println("OI");
		}
	}
}

public class ClasseEstaticaTest {

	public static void main(String[] args) {
		Externa.Interna interna = new Externa.Interna();
		interna.imprime();
		Interna teste = new Interna();
		teste.imprime();
	}

}
