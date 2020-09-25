package br.com.abc.javacore.coleções.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.coleções.classe.Celular;

public class ArrayListObjTest {

	public static void main(String[] args) {
		List<Celular> celularList = new ArrayList<>();
		Celular celular1 = new Celular("Motorola", "12345");
		Celular celular2 = new Celular("Samsung Galaxy", "5678");
		Celular celular3 = new Celular("Iphone", "91011");
		Celular celular4 = new Celular("Iphone", "91011");
		celularList.add(celular1);
		celularList.add(celular2);
		celularList.add(celular3);
		for(Celular celular : celularList) {
			System.out.println(celular);
		}
		System.out.println(celularList.contains(celular4));
	}

}
