package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import br.com.abc.javacore.coleções.classe.Produto;

public class SetTest {

	public static void main(String[] args) {
		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100, 0);
		Produto produto2 = new Produto("123", "Shampoo clear", 10, 20);
		Produto produto3 = new Produto("987", "Playstation 4", 2000, 4);
		Produto produto4 = new Produto("800", "Ventilador", 50, 10);
		Produto produto5 = new Produto("555", "Mesa", 1, 2);
		
		List<Produto> listaProduto = new ArrayList<>();
		listaProduto.add(produto1);
		listaProduto.add(produto2);
		listaProduto.add(produto3);
		listaProduto.add(produto4);
		listaProduto.add(produto5);
		Collections.sort(listaProduto);
		
		//HashSet não tem indice e não tem uma organização definida; Não permite elementos duplicados
		//LinkedHashSet não tem indice, a organização é por ordem de inserção; Não permite elementos duplicados
		
		Set<Produto> setProduto = new LinkedHashSet<>();
		
		for(Produto p : listaProduto) {
			setProduto.add(p);
		}
		System.out.println("------------------");
		for(Produto p : setProduto) {
			System.out.println(p);
		}
	}

}
