package br.com.abc.javacore.exceptions.runtimeexception.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		Object o = null;
		
		int a = 10;
		int b = 0;
		if(a != 0 && b != 0) {
			System.out.println( (a+b) );
		}
		
		int[] array = new int[2];
		System.out.println(array[2]);
		
	}

}
