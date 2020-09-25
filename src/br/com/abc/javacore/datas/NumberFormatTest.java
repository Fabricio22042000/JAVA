package br.com.abc.javacore.datas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		float valor =  12345689f; 
		
		Locale locFr = new Locale("en","US");
		Locale locCa = new Locale("en","CA");
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFr);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFr);
		for(NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locFr);
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(valor));
		
		String valorStr = "3500000000";
		
		NumberFormat nfS = NumberFormat.getInstance(locFr);
		try {
			Number x = nfS.parse(valorStr);	
			Long x1 = (Long) x;
			System.out.println(nfS.format(x1));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
