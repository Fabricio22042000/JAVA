package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.exceptions.chekedexception.classes.Pessoa;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList();
		nomes.add("Fábricio");
		nomes.add("GabrieL");
		nomes.add("Maiara");
//		System.out.println(nomes.remove("Gabriel"));
//		System.out.println(nomes.size());
//		System.out.println(nomes.size());
		List<String> nomes2 = new ArrayList();
		nomes2.add("Fabricio2");
		nomes2.add("Gabriel2");
		nomes2.add("Maiara2");
		nomes.clear();
		nomes.addAll(0, nomes2);
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
