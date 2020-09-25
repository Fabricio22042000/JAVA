package br.com.abc.javacore.tokensedelimitadores;

public class StringTest {

	public static void main(String[] args) {
		String str = "Fabrício, Lucas, Maiara, Gabriel, Luciano";
		String[] listaNomes = str.split(",");
		for(String nome: listaNomes) {
			System.out.println(nome.trim());
		}
	}

}
