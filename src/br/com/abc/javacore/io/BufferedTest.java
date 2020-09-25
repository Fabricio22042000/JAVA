package br.com.abc.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedTest {

	public static void main(String[] args) {
		File file = new File("/home/fabricio/Documentos/workspace/EstudosDevDojo/Arquivo.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("Escrevendo no bloco de texto");
			bw.newLine();
			bw.write("Buffered write");
			bw.flush();
			
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}