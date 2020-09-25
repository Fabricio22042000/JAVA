package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListEArrays {

	public static void main(String[] args) {
		List<Integer> listaInteiros = new ArrayList<>();
		listaInteiros.add(10);
		listaInteiros.add(5);
		listaInteiros.add(4);
		listaInteiros.add(2);
		Integer[] arrayInt = new Integer[listaInteiros.size()];
		listaInteiros.toArray(arrayInt);
		System.out.println("Array: " + Arrays.toString(arrayInt));
		System.out.println("List: " + listaInteiros);
		
		Integer[] arrayInt2 = new Integer[3];
		arrayInt2[0] = 30;
		arrayInt2[1] = 20;
		arrayInt2[2] = 10;
		List<Integer> listaInteiros2 = Arrays.asList(arrayInt2);
		List<Integer> listaInteiros3 = new ArrayList<>();
		listaInteiros3.addAll(listaInteiros2);
		listaInteiros3.add(50);
		System.out.println("Array: " + Arrays.toString(arrayInt2));
		System.out.println("List1: " + listaInteiros2);
		System.out.println("List2: " + listaInteiros3);
	}

}
