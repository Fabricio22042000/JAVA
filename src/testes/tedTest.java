package testes;

import java.util.Locale;
import java.util.Scanner;

public class tedTest {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		String str = "Fabricio Maria 1500.5 true";
		try (Scanner scanner = new Scanner(str)) {
			while(scanner.hasNext()) {
				if(scanner.hasNextBoolean()) {
					boolean b = scanner.nextBoolean();
					System.out.println(b);
				}else if(scanner.hasNextDouble()) {
					double i = scanner.nextDouble();
					System.out.println("Double: " + i);
				}else {
					String nome =  scanner.next();
					System.out.println(nome);
				}
			}
		}
}
}