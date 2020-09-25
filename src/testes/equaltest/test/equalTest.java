package testes.equaltest.test;

import testes.equaltest.classe.Pessoa;

public class equalTest {

	public static void main(String[] args) {
		String fabricio = "fabricio moura";
		String fabricio2 = new String("fabricio moura");
		System.out.println(fabricio.equals(fabricio2));
		Integer num = 5;
		Integer num1 = new Integer(10);
		System.out.println(num.equals(num1));
		
		Pessoa p1 = new Pessoa("fabricio", "123", 20);
		Pessoa p2 = new Pessoa("maiara", "123", 30);
		System.out.println(p1.equals(p2));
		
	}

}
