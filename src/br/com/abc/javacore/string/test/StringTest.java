package br.com.abc.javacore.string.test;

public class StringTest {

	public static void main(String[] args) {
		
		String nome = "Fabricio";
		nome = nome.concat("Moura");
		String nome2 = new String("Feitosa"); // 1- Criando uma variavel de referencia, 2 - Criando um objeto do tipo String, 3- adicionando no pool de String

		
		System.out.println(nome.charAt(1));
		System.out.println(nome.length());
		System.out.println(nome.replace("a", "%"));
		System.out.println(nome.contains("%"));
		System.out.println(nome.trim());
		System.out.println(nome.substring(0, 3));
		
	}

}
