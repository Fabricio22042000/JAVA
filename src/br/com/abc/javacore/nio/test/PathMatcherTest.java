package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class FindAll extends SimpleFileVisitor<Path> {
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**{Test*}.{java,class}");
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if (matcher.matches(file)) {
			System.out.println("file: " + file.getFileName());
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		if ((dir.getFileName().toString().equals("bin"))) {
			return FileVisitResult.SKIP_SIBLINGS;
		}
		// System.out.println("dir: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}
}

public class PathMatcherTest {

	public static void main(String[] args) {
		Path path1 = Paths.get("folder/subfolder/testes.txt");
		Path path2 = Paths.get("testes.txt");
		Path path3 = Paths.get("fabricio-moura");

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.txt");
		System.out.println(matcher.matches(path1));
		System.out.println(matcher.matches(path2));
		System.out.println("----------------");
		matches(path3, "glob:{fabricio,moura}*");
		System.out.println("----------------");

		try {
			Path path = Paths.get("./");
			Files.walkFileTree(path, new FindAll());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(matcher.matches(path));
	}
}
