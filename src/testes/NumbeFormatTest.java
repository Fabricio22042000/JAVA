package testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumbeFormatTest {

	public static void main(String[] args) {
		String valor = "123456789";
		Locale loc = new Locale("en", "US");
		NumberFormat nf = NumberFormat.getInstance(loc);
		
		try {
			Long x = (Long) nf.parse(valor);
			System.out.println(nf.format(x));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
