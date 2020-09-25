package br.com.abc.javacore.coleções.test;

import br.com.abc.javacore.coleções.classe.Celular;

public class EqualsTest {

	public static void main(String[] args) {
		// Reflexivo se x.equals(x) tem que ser true para tudo que for diferente de
		// null;
		// Simetrico se x e y for diferente de null, se x.equals(y) for true, logo
		// y.equals(x) tem que ser true;
		// Transitividade para x,y,z diferentes de null se x.equals(y) true logo
		// y.equals(x) tem que ser true e se x.equals(z) true, y.equals(z)
		// tambem tem que ser true;
		// Consistente x.equals(y) tem que sempre retornar o mesmo valor;
		// se x.equals(null) retornar sempre falso;
		// Classes Wrappers o método equals funciona normalmente;
		Integer i = 5;
		Integer f = new Integer(5);
		System.out.println(i.equals(f));
		Celular c1 = new Celular("Motorola", "123");
		Celular c2 = new Celular("Motorola", "123");
		System.out.println(c1.equals(c2));
	}

}
