package br.com.abc.javacore.jdbc.teste;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.jdbc.classe.Comprador;

public class TesteConexao {

	public static void main(String[] args) {
//		deletar();
//		salvar();
//		atualizar();
//		buscarTudo();
//		List<Comprador> list = buscarPorNome("F");
//		System.out.println(list);
//		CompradorDB.selectMetaData();
//		CompradorDB.checkDriverSuportted();
//		CompradorDB.typeScroll();
//		CompradorDB.updateUsingResultSet();
//		System.out.println(CompradorDB.searchByNamePreparedStatement("fa"));
//		Comprador c = new Comprador(9, "999-999-999-99", "Manuela");
//		CompradorDB.updatePreparedStatement(c);
//		System.out.println(CompradorDB.searchByNameCallableStatement("fa"));
//		System.out.println(CompradorDB.searchByNameJdbcRowSet("fa"));
//		CompradorDB.updateCachedRowSet(new Comprador(11, "555-555-555-55","CachedRS"));
		try {
			CompradorDB.saveTransations();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void salvar() {
		Comprador c = new Comprador("555-555-555-55", "José");
		CompradorDB.save(c);
	}

	public static void deletar() {
		Comprador c = new Comprador(12, "111-111-111-80", "João");
		CompradorDB.delete(c);
	}

	public static void atualizar() {
		Comprador c = new Comprador(11, "555-555-555-55", "Fabricio");
		CompradorDB.update(c);
	}

	public static void buscarTudo() {
		CompradorDB.searchAll();
	}

	public static List<Comprador> buscarPorNome(String name) {
		return CompradorDB.searchByName(name);
	}
}
