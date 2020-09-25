package br.com.abc.javacore.tokensedelimitadores;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		try(Scanner scanner = new Scanner("Fabricio>2000.5>15>Maria>true>10.0")){
		scanner.useDelimiter(">");
		
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {
				int i = scanner.nextInt();
				System.out.println("Int: " + i);
			}else if(scanner.hasNextDouble()) {
				Double d = scanner.nextDouble();
				System.out.println("Double: " + d);
			}else if(scanner.hasNextBoolean()){
				boolean b = scanner.nextBoolean();
				System.out.println("Boolean: " + b);
			}else {
				String s = scanner.next();
				System.out.println("String: " + s);
				}
			}
		}
	}
}
