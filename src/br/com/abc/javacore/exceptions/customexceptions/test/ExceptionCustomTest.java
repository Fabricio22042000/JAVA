package br.com.abc.javacore.exceptions.customexceptions.test;

import br.com.abc.javacore.exceptions.customexceptions.exceptions.LoginInvalidoException;

public class ExceptionCustomTest {

	public static void main(String[] args) {
		try {
			login();	
		}catch(LoginInvalidoException e) {
			e.printStackTrace();
		}
		
		
	}
	private static void login() throws LoginInvalidoException{
		String loginBanco = "Fabricio";
		String senhaBanco = "Fabriciohc21";
		String loginUsu = "Fabricio";
		String senhaUsu = "Fabriciohc22";
		
		if(!loginBanco.equalsIgnoreCase(loginUsu) || !senhaBanco.equals(senhaUsu)) {
			throw new LoginInvalidoException();
		}else {
			System.out.println("Logado");
		}
	}
}
