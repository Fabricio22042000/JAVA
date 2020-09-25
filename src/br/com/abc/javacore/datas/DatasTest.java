package br.com.abc.javacore.datas;

import java.util.Calendar;
import java.util.Date;

public class DatasTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		date.setTime(date.getTime() + 3_600_000L);
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();

		
		//c.set(2020, 07, 27);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.MONTH));
		
		c.roll(Calendar.HOUR, 2);
		
		Date data2 = c.getTime();
		System.out.println(data2);
		
	}

}
