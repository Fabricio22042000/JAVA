package br.com.abc.javacore.exceptions.chekedexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import br.com.abc.javacore.exceptions.chekedexception.classes.Funcionario;
import br.com.abc.javacore.exceptions.chekedexception.classes.Pessoa;

public class SobrescritaMetodosException {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Funcionario f = new Funcionario();
		
		try {
			p.salvar();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		try {
			f.salvar();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
