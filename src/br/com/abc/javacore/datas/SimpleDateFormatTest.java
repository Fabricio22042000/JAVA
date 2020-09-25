package br.com.abc.javacore.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat formatar = new SimpleDateFormat("'(Horário de joão pessoa-PB)' dd'/'MM'/'yyyy 'at' HH:mm:ss");
		
		System.out.println(formatar.format(c.getTime()));
	}

}
