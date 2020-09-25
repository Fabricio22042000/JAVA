package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class DosFileAttributesTest {

	public static void main(String[] args) {
		//DosFileAttributes, DosFileAttributesView > WINDOWS
		Path path = Paths.get("folder/teste.txt");
		try {
			//Files.createFile(path);
			DosFileAttributes dosfile = Files.readAttributes(path, DosFileAttributes.class);
//			Files.setAttribute(path, "dos:hidden", true);
//			Files.setAttribute(path, "dos:readonly", true);
//			dosfile = Files.readAttributes(path, DosFileAttributes.class);
//			System.out.println(dosfile.isHidden());
//			System.out.println(dosfile.isReadOnly());
			
			DosFileAttributeView dosview = Files.getFileAttributeView(path, DosFileAttributeView.class);
			dosview.setHidden(true);
			dosview.setReadOnly(true);
			dosfile = Files.readAttributes(path, DosFileAttributes.class);
			System.out.println(dosfile.isHidden());
			System.out.println(dosfile.isReadOnly());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
