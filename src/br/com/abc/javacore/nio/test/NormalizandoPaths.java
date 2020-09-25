package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizandoPaths {

	public static void main(String[] args) {
		Path p1 = Paths.get("/home/fabricio/Documentos/workspace/../../");
		Path p2 = Paths.get("/home/./fabricio/./Documentos/./workspace");
		System.out.println(p2);
		System.out.println(p2.normalize());
	}

}
