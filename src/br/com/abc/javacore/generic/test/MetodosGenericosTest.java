package br.com.abc.javacore.generic.test;

import java.util.ArrayList;
import java.util.List;


public class MetodosGenericosTest {

	public static void main(String[] args) {
		List<Gato> x = criarList(new Gato());
		System.out.println(x);
		
	}
	public static <T extends Animal> List<T> criarList(T t) {
		List<T> lista = new ArrayList<>();
		lista.add(t);
		return lista;
	}
}
