package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {

	public static void main(String[] args) {
		Path path = Paths.get("folder/teste.txt");
		try {
			PosixFileAttributes posixfile = Files.readAttributes(path, PosixFileAttributes.class);
			System.out.println(posixfile.permissions());
			Set<PosixFilePermission> permission = PosixFilePermissions.fromString("rw-r--r--");
			Files.setPosixFilePermissions(path, permission);
			posixfile = Files.readAttributes(path, PosixFileAttributes.class);
			System.out.println(posixfile.permissions());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
