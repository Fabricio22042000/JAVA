package br.com.abc.javacore.exceptions.chekedexception;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			abrirArquivo();			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String abrirArquivo() throws Exception{
		try {
			System.out.println("Abrindo arquivo");
			System.out.println("Lendo o arquivo");
			System.out.println("Escrevendo no arquivo");
			return "abc";
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fechando arquivo");
		}
		return "abc";
	}
}
