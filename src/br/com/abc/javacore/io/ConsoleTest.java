package br.com.abc.javacore.io;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console c = System.console();
		char[] pw = c.readPassword("%s","Digite: ");
		for(char pass : pw) {
			c.format("%s", pass);
		}
		System.out.println();
	}
}
