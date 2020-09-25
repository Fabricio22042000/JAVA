package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.abc.javacore.coleções.classe.Consumidor;
import br.com.abc.javacore.coleções.classe.Produto;

public class ConsumidorMapTest {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Fabricio Moura", "018");
		Consumidor consumidor2 = new Consumidor("Gabriel Madsa", "020");
		
		Produto produto1 = new Produto("456", "Notebook Aspire 5", 2100, 0);
		Produto produto2 = new Produto("123", "Shampoo clear", 10, 20);
		Produto produto3 = new Produto("987", "Playstation 4", 2000, 4);
		Produto produto4 = new Produto("800", "Ventilador", 50, 10);
		
		List<Produto> listaDeProdutosConsumidor1 = new ArrayList<>();
		listaDeProdutosConsumidor1.add(produto1);
		listaDeProdutosConsumidor1.add(produto3);
		List<Produto> listaDeProdutosConsumidor2 = new ArrayList<>();
		listaDeProdutosConsumidor2.add(produto2);
		listaDeProdutosConsumidor2.add(produto4);
		
		Map<Consumidor, List<Produto>> map = new HashMap<>();
		map.put(consumidor1, listaDeProdutosConsumidor1);
		map.put(consumidor2, listaDeProdutosConsumidor2);
		
		for(Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
			System.out.print("Consumidor: " + entry.getKey().getNome() + ": ");
			for(Produto p : entry.getValue()) {
				System.out.print(p.getNome() + " / " );
			}
			System.out.println();
		}
		
	}

}
