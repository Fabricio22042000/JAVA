package br.com.abc.javacore.exceptions.chekedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {

	public static void main(String[] args) {
		

	}
	
	public static void abrirArquivo() {
		try(Reader reader = new BufferedReader(new FileReader("teste.txt"));) {
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void abrirArquivoOld() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();	
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
