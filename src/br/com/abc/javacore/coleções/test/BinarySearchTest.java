package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.abc.javacore.coleções.classe.Produto;

public class BinarySearchTest {

	public static void main(String[] args) {
		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(5);
		inteiros.add(1);
		inteiros.add(9);
		inteiros.add(10);
		
		// -(ponto de inserção) -1;
		Collections.sort(inteiros);
		inteiros.add((-(Collections.binarySearch(inteiros, 11))-1), 11);
		System.out.println("Pegando: " + inteiros.get(Collections.binarySearch(inteiros, 11)));
		
		List<Produto> produtos = new ArrayList<>();

		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100);
		Produto produto2 = new Produto("123", "Shampoo clear", 10);
		Produto produto3 = new Produto("987", "Playstation 4", 2000);
		Produto produto4 = new Produto("800", "Ventilador", 50);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Collections.sort(produtos);
		
		Produto produto5 = new Produto("000", "Bicicleta", 700);
		if(Collections.binarySearch(produtos, produto5) < 0) {
			produtos.add((-(Collections.binarySearch(produtos, produto5))-1), produto5);
		}
		System.out.println(produtos.get(Collections.binarySearch(produtos, produto5)));
		System.out.println("-------------");
		for(Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("-------------");
		Produto[] arrayProdutos = new Produto[3];
		arrayProdutos[0] = produto1;
		arrayProdutos[1] = produto2;
		arrayProdutos[2] = produto3;
		Arrays.sort(arrayProdutos);
		System.out.println("Pegando: " + arrayProdutos[Arrays.binarySearch(arrayProdutos, produto1)]);
		for(Produto pa : arrayProdutos) {
			System.out.println(pa);
		}
	}
	
}
