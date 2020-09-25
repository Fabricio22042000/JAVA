package br.com.abc.javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Locale locUS = new Locale("en", "US");
		
		DateFormat[] date = new DateFormat[6];
		date[0] = DateFormat.getInstance();
		date[1] = DateFormat.getDateInstance(DateFormat.SHORT);
		date[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		date[3] = DateFormat.getDateInstance(DateFormat.LONG, locUS);
		date[4] = DateFormat.getDateInstance(DateFormat.FULL);
		date[5] = DateFormat.getDateInstance();
		
		for(DateFormat df : date) {
			System.out.println(df.format(c.getTime()));
		}
		
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locUS).format(c.getTime()));
		
}

}
