package br.com.abc.javacore.classeInterna.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.abc.javacore.generic.classe.Carro;

class Animal{
	public void andar() {
		System.out.println("Andando");
	}
}

public class ClasseAnonimaTest {

	public static void main(String[] args) {
		Animal a = new Animal() {
			@Override
			public void andar() {
				System.out.println("Andando anonimamente");
			}
		};
		a.andar();
		
		List<Carro> listaCarros = new ArrayList<>();
		listaCarros.add(new Carro("BMW"));
		listaCarros.add(new Carro("Audi"));
		Collections.sort(listaCarros, new Comparator<Carro>() {
			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getModelo().compareTo(o2.getModelo());
			}
		});
		System.out.println(listaCarros);
	}
}
