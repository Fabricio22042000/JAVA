package br.com.abc.javacore.io;

import java.io.File;
import java.io.IOException;

public class DirTest {

	public static void main(String[] args) throws IOException{
		File file = new File("folder");
		boolean isCriado = file.mkdir();
		System.out.println("Arquivo criado? " + isCriado);
		
		File arquivo = new File(file, "arquivo.txt");
		boolean isCreated = arquivo.createNewFile();
		System.out.println("Arquivo criado? " + isCreated);
		File arquivoRenomeado = new File(file, "arquivo_renomeado.txt");
		System.out.println("Renomeado? " + arquivo.renameTo(arquivoRenomeado));
		File arquivo2 = new File(file, "arquivo.txt");
		System.out.println("Arquivo criado? " + arquivo2.createNewFile());
		buscarArquivos("folder");
	}
	public static void buscarArquivos(String nomePasta) {
		File file = new File(nomePasta);
		String[] listaArquivos = file.list();
		System.out.println("-----Lista de arquivos-----");
		for(String arquivo : listaArquivos) {
			System.out.println(arquivo);
		}
	}
}
