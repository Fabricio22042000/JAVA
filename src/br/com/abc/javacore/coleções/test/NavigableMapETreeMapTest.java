package br.com.abc.javacore.coleções.test;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import br.com.abc.javacore.coleções.classe.Consumidor;
public class NavigableMapETreeMapTest {

//		System.out.println(map.lowerEntry("C"));
//		System.out.println(map.pollFirstEntry());
	
	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Fabricio Moura", "018");
		Consumidor consumidor2 = new Consumidor("Gabriel Moura", "020");
		Consumidor consumidor3 = new Consumidor("Gabriel Mour", "020");
		NavigableMap<Consumidor, String> map = new TreeMap<>();
		map.put(consumidor1, "Letra D");
		map.put(consumidor3, "Letra F");
		map.put(consumidor2, "Letra B");
		
		Map<Consumidor, String> cons = new LinkedHashMap<>();
		for(Map.Entry<Consumidor, String> entry: map.entrySet()) {
			System.out.println(entry.getKey().getNome());
			cons.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry<Consumidor, String> entry : cons.entrySet()) {
			System.out.println(entry.getKey().getNome() + " " + entry.getValue());
		}
		
		
//		for(Map.Entry<Consumidor, String> entry : map.entrySet()) {
//			System.out.println(entry.getKey().getNome() + " " + entry.getValue());
//		}
//		System.out.println("------------");
//		for(Map.Entry<Consumidor, String> entry : map.entrySet()) {
//			System.out.println(entry.getKey().getNome() + " " + entry.getValue());
//		}
	}

}
