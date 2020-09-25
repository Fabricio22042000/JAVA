package br.com.abc.javacore.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {

	public static void main(String[] args) throws IOException {
		Date datelasmodified = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
		File file = new File("folder/arquivo.txt");
		file.setLastModified(datelasmodified.getTime());
		System.out.println(file.lastModified());
		file.delete();
		Path path = Paths.get("folder/arquivo.txt");
		Files.createFile(path);
		FileTime time = FileTime.fromMillis(datelasmodified.getTime());
		Files.setLastModifiedTime(path, time);
		System.out.println(Files.getLastModifiedTime(path));
		Files.deleteIfExists(path);
		
		//BasicFileAttributes, PosixFileAttributes, DosFileAttributes
		path = Paths.get("src/br/com/abc/javacore/polimorfismo/classe/Gerente.java");
		BasicFileAttributes basicfile = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("created: "+basicfile.creationTime());
		System.out.println("last modified: " + basicfile.lastModifiedTime());
		System.out.println("last acess: " + basicfile.lastAccessTime());
		
		System.out.println("-----DEPOIS-----");
		Date dateLastAcess = new GregorianCalendar(2020, Calendar.JANUARY, 22).getTime();
		Date dateCreated = new GregorianCalendar(2020, Calendar.JANUARY, 4).getTime();
		
		BasicFileAttributeView basicview = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		
		FileTime lastAccessTime = FileTime.fromMillis(dateLastAcess.getTime());
		FileTime lastModifiedTime = basicfile.lastModifiedTime();
		FileTime createTime = FileTime.fromMillis(dateCreated.getTime());
		basicview.setTimes(lastModifiedTime, lastAccessTime, createTime);
		
		System.out.println("Created: " + basicfile.creationTime());
		System.out.println("Last modified: " + basicfile.lastModifiedTime());
		System.out.println("Last acess: " + basicfile.lastAccessTime());
	}
}
