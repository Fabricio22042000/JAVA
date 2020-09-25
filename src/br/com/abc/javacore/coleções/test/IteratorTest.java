package br.com.abc.javacore.coleções.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.abc.javacore.coleções.classe.Produto;

public class IteratorTest {

	public static void main(String[] args) {
		List<Produto> produtos = new LinkedList<>();

		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100, 0);
		Produto produto2 = new Produto("123", "Shampoo clear", 10, 0);
		Produto produto3 = new Produto("987", "Playstation 4", 2000, 0);
		Produto produto4 = new Produto("800", "Ventilador", 50, 10);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Iterator<Produto> iteratorProduto = produtos.iterator();
		//hasNext() - next();
		while(iteratorProduto.hasNext()) {
			if(iteratorProduto.next().getQuantidade() == 0) {
				iteratorProduto.remove();
			}
		}
		for(Produto p : produtos) {
			System.out.println(p);
		}
	}

}
