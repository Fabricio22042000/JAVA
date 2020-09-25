package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.abc.javacore.coleções.classe.Produto;

class ProdutoNomeComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}

public class SortObjTest {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto[] arrayProdutos = new Produto[4];

		Produto produto1 = new Produto("456", "Notebook Aspire 5", 10);
		Produto produto2 = new Produto("123", "Shampoo clear", 10);
		Produto produto3 = new Produto("987", "Playstation 4", 100);
		Produto produto4 = new Produto("800", "Ventilador", 50);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		arrayProdutos[0] = produto1;
		arrayProdutos[1] = produto2;
		arrayProdutos[2] = produto3;
		arrayProdutos[3] = produto4;

		Collections.sort(produtos);
		Arrays.sort(arrayProdutos, new ProdutoNomeComparator());
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
//		System.out.println("------------");
//		for (Produto produto : arrayProdutos) {
//			System.out.println(produto);
//		}
	}
}
