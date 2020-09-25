package br.com.abc.javacore.classeInterna.test;

public class ClasseLocalTest {
	private String nome = "Fabricio Moura";

	public void qualquerCoisa() {
		String sobrenome = "Feitosa";
		class ClasseLocal {
			public void imprimeNomeExterno() {
				System.out.println(nome);
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
