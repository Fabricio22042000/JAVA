package br.com.abc.javacore.generic.test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		// type erasure
		List<String> lista = new ArrayList<>();
		lista.add("Fabricio");
		lista.add("Moura");
		for(String s : lista) {
			System.out.println(s);
		}
		add(lista, 1L);
	}
	public static void add(List lista, Long l) {
		lista.add(l);
	}
}
