package br.com.abc.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {

	public static void main(String[] args) {
		// /home/fabricio/Documentos/workspace/EstudosDevDojo
		Path p1 = Paths.get("/home/fabricio/Documentos/workspace/EstudosDevDojo/Arquivo.txt");
		Path p2 = Paths.get("/home/fabricio/Documentos/workspace/EstudosDevDojo/", "Arquivo.txt");
		Path p3 = Paths.get("/home", "/fabricio/Documentos/workspace/EstudosDevDojo/", "Arquivo.txt");
		Path p4 = Paths.get("home", "fabricio", "Documentos", "workspace", "EstudosDevDojo", "Arquivo.txt");
		File file = p2.toFile();
		Path path = file.toPath();
		
		Path path1 = Paths.get("pasta/subpasta/subsubpasta/teste.txt").getParent();
		Path arquivo = Paths.get(path1.toString()+"/teste.txt");
		Path target = Paths.get("folder/subfolder/testes.txt"); // OBS!
		try {
			if(Files.notExists(path1)) {
				Files.createDirectories(path1);
			}
			if(Files.notExists(arquivo)) {
				Files.createFile(arquivo);
			}
			Files.copy(arquivo, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
