package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

//class AcharTodosTxt extends SimpleFileVisitor<Path> {
//	@Override
//	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//		if (file.getFileName().toString().endsWith(".txt")) {
//			System.out.println(file.getFileName());
//		}
//		return FileVisitResult.CONTINUE;
//	}
//}

class BuscarAquivos extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		throw exc;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if (file.getFileName().toString().endsWith(".bkp")) {
			System.out.println("file: " + file.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre: " + dir.getFileName());
		if (dir.getFileName().toString().equals("subsubpasta")) {
			return FileVisitResult.SKIP_SUBTREE;
		}
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("post: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}
}

public class FileVisitorTest {
	public static void main(String[] args) {
		try {
			Files.walkFileTree(Paths.get("pasta"), new BuscarAquivos());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
