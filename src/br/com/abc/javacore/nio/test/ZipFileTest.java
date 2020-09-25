package br.com.abc.javacore.nio.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileTest {

	public static void main(String[] args) {
		Path dirZip = Paths.get("pasta");
		Path dirFile = Paths.get("pasta/subpasta/subsubpasta");
		Path zipFile = dirZip.resolve("arquivo.zip");

		try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFile);) {
			for (Path path : stream) {
				zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
				BufferedInputStream bs = new BufferedInputStream(new FileInputStream(path.toFile()));
				byte[] bytes = new byte[2042];
				while ((bs.read(bytes)) != -1) {
					zip.write(bytes);
					zip.flush();
				}
				bs.close();
				zip.closeEntry();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
