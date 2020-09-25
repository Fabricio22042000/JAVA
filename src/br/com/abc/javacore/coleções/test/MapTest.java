package br.com.abc.javacore.coleções.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("tevlado", "teclado");
		map.put("vc", "você");
		map.put("meza", "mesa");
		map.put("vdd", "verdade");
		// keySet e values
//		for(String key : map.keySet()) {
//			System.out.println(key);	
//		}
		for(Map.Entry<String, String> c : map.entrySet()) {
			System.out.println(c);
		}

	}

}
