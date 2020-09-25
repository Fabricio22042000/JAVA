package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {

	public static void main(String[] args) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get("folder"));){
			for(Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
