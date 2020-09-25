package br.com.abc.javacore.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterReaderTest {

	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		Path path = Paths.get("testando;txt");
		try(FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file)){
			
			fw.write("Fabricio Moura: está aprendendo a classe File do JAVA!\nE ele está na aula 96 do DevDojo");
			fw.flush();
			
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c : in) {
				System.out.print(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		/*try {
			FileWriter fw = new FileWriter(file);
			fw.write("Fabricio Moura: est� aprendendo a classe File do JAVA!\nE ele est� na aula 96 do DevDojo");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: " + size);
			for(char c : in) {
				System.out.print(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

}
}
