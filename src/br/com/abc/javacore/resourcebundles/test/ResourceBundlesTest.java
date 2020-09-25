package br.com.abc.javacore.resourcebundles.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		System.out.println(rb.getString("pequeno"));
		System.out.println(rb.getString("grande"));
		System.out.println(rb.getString("banana"));
		System.out.println(rb.getString("macaco"));
		rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
		System.out.println(rb.getString("pequeno"));
		System.out.println(rb.getString("grande"));
		System.out.println(rb.getString("banana"));
		System.out.println(rb.getString("macaco"));
	}
}