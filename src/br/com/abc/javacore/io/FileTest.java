package br.com.abc.javacore.io;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		
		try {
			boolean createFile = file.createNewFile();
			System.out.println("Arquivo criado? " + createFile);
			boolean exists = file.exists();
			if(exists) {
				System.out.println("Posso ler? " + file.canRead());
				System.out.println("Caminho: " + file.getPath());
				System.out.println("Caminho absoluto: " + file.getAbsolutePath());
				System.out.println("Hidden: " + file.isHidden());
				System.out.println("É um diretório? " + file.isDirectory());
				System.out.println("Última modificação: " + DateFormat.getDateInstance(DateFormat.SHORT).format(new Date(file.lastModified())) );
				System.out.println("Deletado? " + file.delete());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
