package br.com.abc.javacore.wrapper.test;

import br.com.abc.javacore.exceptions.chekedexception.classes.Pessoa;

public class WrapperTest {

	public static void main(String[] args) {
		
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long longPrimitivo = 10;
		float floatPrimitivo = 10.0F;
		double doublePrimitivo = 10.0;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer intWrapper = 10;
		Long longWrapper = Long.valueOf(10); //Retorna um wrapper
		Float floatWrapper = 10F;
		Double doubleWrapper = 10D;
		Character charWrapper = 'A';
		Boolean booleanWrapper = true;
		
		System.out.println(charWrapper.isUpperCase('a'));
		System.out.println(charWrapper.isDigit('1'));
		System.out.println(charWrapper.isLetter('5'));
		System.out.println(charWrapper.isLetterOrDigit('%'));
		System.out.println(charWrapper.isLowerCase('b'));
		System.out.println(charWrapper.toUpperCase('b'));
		
		
		int i = intWrapper.intValue(); //Unboxing - Transformando valores wrapper em valores primitivos
		
		Integer inte2 = Integer.valueOf(30); //Boxing - Transformando valores primitivos em wrapper
		
	}

}
