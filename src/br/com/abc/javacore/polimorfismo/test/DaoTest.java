package br.com.abc.javacore.polimorfismo.test;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.abc.javacore.polimorfismo.classe.ArquivoDAOimpl;
import br.com.abc.javacore.polimorfismo.classe.DataBaseDAOimpl;
import br.com.abc.javacore.polimorfismo.classe.GerericDAO;

public class DaoTest {

	public static void main(String[] args) {
		
		GerericDAO arquivoDAO = new ArquivoDAOimpl();
		arquivoDAO.save();

	}
}
