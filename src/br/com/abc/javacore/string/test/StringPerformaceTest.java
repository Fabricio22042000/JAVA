package br.com.abc.javacore.string.test;

public class StringPerformaceTest {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		stringPerformace(30000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo Final: " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		stringBuffer(30000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo Final String buffer: " + (fim-inicio) + "ms");
		
		inicio = System.currentTimeMillis();
		stringBuilder(30000000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo Final String builder: " + (fim-inicio) + "ms");
		
	}
	
	public static void stringPerformace(int valor) {
		String string = "";
		for(int i=0;i < valor;i++) {
			string += valor;
		}
	}

	public static void stringBuilder(int valor) {
		StringBuilder sb = new StringBuilder(valor);
		for(int i=0;i < valor;i++) {
			sb.append(i);
		}
	}
	
	public static void stringBuffer(int valor) {
		StringBuffer sb = new StringBuffer(valor);
		for(int i=0;i < valor;i++) {
			sb.append(i);
		}
	}
}
