package br.com.abc.javacore.generic.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
	public abstract void consulta();
}

class Cachorro extends Animal implements Comparable<Cachorro> {
	@Override
	public void consulta() {
		System.out.println("Consultando Cachorro");
	}

	@Override
	public int compareTo(Cachorro o) {
		return 0;
	}

}

class Gato extends Animal {
	@Override
	public void consulta() {
		System.out.println("Consultando Gato");
	}
}

public class WildCardTest {

	public static void main(String[] args) {
		Cachorro[] arrayC = { new Cachorro(), new Cachorro() };
		Gato[] arrayG = { new Gato(), new Gato() };
//		consultarAnimais(arrayC);
//		consultarAnimais(arrayG);
		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro());
		List<Gato> gatoList = new ArrayList<>();
		gatoList.add(new Gato());
		consultarAnimaisList(cachorroList);
		List<Animal> animalList = new ArrayList<>();
		consultarAnimaisList(cachorroList);
		consultarAnimaisList(gatoList);
		ordenarLista(cachorroList);
	}

	public static void consultarAnimais(Animal[] animals) {
		for (Animal a : animals) {
			a.consulta();
		}
		//animals[1] = new Gato();
	}

	// type erasure | ?
	public static void consultarAnimaisList(List<? extends Animal> animals) {
		for (Animal a : animals) {
			a.consulta();
		}
	}

	public static void consultarCachorroList(List<? super Cachorro> cachorro) {
		Cachorro c = new Cachorro();
		Animal c1 = new Gato();
		Object c2 = new Cachorro();
		cachorro.add(new Cachorro());
	}

	public static void ordenarLista(List<? extends Comparable> lista) {
		Collections.sort(lista);
	}
}
