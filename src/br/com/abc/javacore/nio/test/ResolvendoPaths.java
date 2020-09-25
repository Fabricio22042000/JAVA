package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {

	public static void main(String[] args) {
		Path absoluto = Paths.get("/home/fabricio");
		Path relativo = Paths.get("pasta");
		Path file = Paths.get("Arquivo.txt");
		System.out.println("1: "+absoluto.resolve(relativo));
		System.out.println("2: "+absoluto.resolve(file));
		System.out.println("3: "+relativo.resolve(file));
		System.out.println("4: "+relativo.resolve(absoluto));
		System.out.println("5: "+file.resolve(relativo));
		System.out.println("6: "+file.resolve(absoluto));
	}
}
