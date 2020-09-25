package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizandoPaths {

	public static void main(String[] args) {
		Path absoluto = Paths.get("/home/fabricio");
		Path absoluto1 = Paths.get("/usr/local");
		Path absoluto3 = Paths.get("/home/fabricio/java/Pessoa.java");
		Path relativo1 = Paths.get("temp");
		Path relativo2 = Paths.get("temp/Funcionario.java");
		System.out.println(absoluto.relativize(absoluto3));
		System.out.println(absoluto.relativize(absoluto1));
		System.out.println(relativo1.relativize(relativo2));
//		System.out.println(absoluto.relativize(relativo1));
//		System.out.println(relativo2.relativize(absoluto1));
	}
}
