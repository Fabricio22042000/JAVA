package br.com.abc.javacore.interfaces.test;

import br.com.abc.javacore.interfaces.classes.Produto;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto p = new Produto("Notebook", 3000, 2);
		p.calculaPreco();
		p.calculaFrete();
		
		System.out.println(p);
}
}