package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// \d - Todos os digitos;
		// \D - Tudo oque n�o for digito;
		// \s - Espa�os em branco;
		// \S - Todos os caracteres que n�o � branco
		// \w - Caractres de palavras a-z, A-Z, digitos e _
		// \W - Tudo oque n�o � palavra e nem digito
		// []

		// ? - zero ou uma
		// * - zero ou mais
		// + - uma ou mais
		// {n,m} vai de n at� m
		// ()
		// |
		// $ - fim da linha
		// . - coringa > aceita qualquer valor
		// ^ - caratere de nega��o [^abc] - n�o tem a,b ou c
		
		//String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // Padr�o HEXADECIMAIS
		//String texto = "Fabricio moura 0x 0X9F 0X01FFG 0x02F";
		
		//String regex = "([a-zA-Z0-9])+@([a-zA-Z])+(\\.([a-z])+)+"; // PADR�O EMAILS
		//String[] validar = texto.split(" ");
		String regex = "[\\d]{2}/[\\d]{2}/([\\d]{4}|[\\d]{2})";
		String texto = "01/08/2020 01/01/220 22/04/2000 13/3/20 22/04/90"; //Padr�o DATAS
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher =  pattern.matcher(texto);
		
		System.out.println("texto:  "+texto);
		System.out.println("indice: 0123456789");
		System.out.println("expressão: " + matcher.pattern());
		System.out.println("Expressoes encontradas");
		while(matcher.find()) {
			System.out.print(matcher.start() + " " );
			System.out.println(matcher.group());
		}
		
		System.out.println("-----Validação-----");
		
//		for(String email : validar) { 
//		boolean isValido = email.matches(regex);
//		if(isValido) { 
//			System.out.println("Email: " + email + " É valido"); 
//		}else {
//			System.out.println("Email: " + email + " Não é valido"); } 
//		 }
	}	
}
