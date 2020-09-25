package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Fabrício");
		nomes.add("Maria");
		nomes.add("Gabriel");
		nomes.add("João");
		nomes.add("Ana");
		Collections.sort(nomes);
		for(String nome : nomes) {
			System.out.println(nome);
		}
		List<Double> numeros = new ArrayList<>();
		numeros.add(2d);
		numeros.add(1.5);
		numeros.add(1.3);
		numeros.add(1.9);
		Collections.sort(numeros);
		for(Double numero : numeros) {
			System.out.println(numero);
		}
	}

}
