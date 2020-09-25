package br.com.abc.javacore.coleções.test;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.abc.javacore.coleções.classe.Produto;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Produto> queue = new PriorityQueue<>();

		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100, 0);
		Produto produto2 = new Produto("123", "Shampoo clear", 10, 20);
		Produto produto3 = new Produto("111", "Playstation 4", 2000, 4);
		
		queue.add(produto1);
		queue.add(produto2);
		queue.add(produto3);
		
		for(Produto p : queue) {
			System.out.println(p);
		}
	}

}
