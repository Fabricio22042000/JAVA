package br.com.abc.javacore.string.test;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder nomes = new StringBuilder();
		nomes.append("Fabr�cio>").append("Carlos>").append("Maria>").append("Jo�o>");
		// nomes.insert(11, "###");
		// nomes.delete(0, 8);
		System.out.println(nomes);

		String[] listaNomes = nomes.toString().split(">");

		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}
}
