package br.com.abc.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		Locale locFr = new Locale("fr", "FR");
		Locale locAle = new Locale("de", "DE");
		Locale locEn = new Locale("en", "");
		Locale locKr = new Locale("zr", "");
		
		Calendar c = Calendar.getInstance();
		
		//c.set(2010, Calendar.MARCH, 22);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locFr);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locAle);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locEn);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locKr);
		
		System.out.println(df.format(c.getTime()));
		System.out.println(df2.format(c.getTime()));
		System.out.println(df3.format(c.getTime()));
		System.out.println(df4.format(c.getTime()));
		
		System.out.println(locFr.getDisplayLanguage(locAle));
	}

}
