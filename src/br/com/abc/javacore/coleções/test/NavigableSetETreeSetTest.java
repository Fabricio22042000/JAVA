package br.com.abc.javacore.coleções.test;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.com.abc.javacore.coleções.classe.Produto;

public class NavigableSetETreeSetTest {
	public static void main(String[] args) {
		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100, 0);
		Produto produto2 = new Produto("123", "Shampoo clear", 10, 20);
		Produto produto3 = new Produto("987", "Playstation 4", 2000, 4);
		Produto produto4 = new Produto("800", "Ventilador", 50, 10);
		Produto produto5 = new Produto("222", "Mesa", 10, 2);
		Produto produto6 = new Produto("222", "Cachorro", 2000, 2);
		
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto5);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto6);
		
		for(Produto p : produtoNavigableSet) {
			System.out.println(p);
		}
		// lower < 
		// floor <=
		// higher > 
		// ceiling >=
		// descendingSet() - inverte a ordem da lista
		System.out.println("----------");
		produtoNavigableSet.descendingSet();
	}

}
