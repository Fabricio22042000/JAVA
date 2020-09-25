package br.com.abc.javacore.classeInterna.test;

public class ClasseExternaTest {
	private String nome = "Fabrício Moura";

	class Interna {
		public void verNome() {
			System.out.println(ClasseExternaTest.this.nome);
		}
	}

	public static void main(String[] args) {
		Interna interna = new ClasseExternaTest().new Interna();
		interna.verNome();
	}

}
