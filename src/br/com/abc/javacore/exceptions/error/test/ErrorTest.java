package br.com.abc.javacore.exceptions.error.test;

public class ErrorTest {

	public static void main(String[] args) {
		stackOverflowError();

	}
	public static void stackOverflowError() {
		stackOverflowError();
	}
}
