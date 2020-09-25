package br.com.abc.javacore.jdbc.teste;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

import java.sql.PreparedStatement;

import br.com.abc.javacore.jdbc.classe.Comprador;
import br.com.abc.javacore.jdbc.classe.MyRowSetListner;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

public class CompradorDB {

	public static void save(Comprador c) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('" + c.getNome() + "','" + c.getCpf()
				+ "')";
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			ConexaoFactory.close(conn, stat);
			System.out.println("Comprador inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete(Comprador c) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = " + c.getId() + ")";
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			ConexaoFactory.close(conn, stat);
			System.out.println("Comprador deletado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(Comprador c) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + c.getCpf() + "' WHERE (`id` = '" + c.getId() + "')";
		try {
			Statement stat = conn.createStatement();
			stat.executeUpdate(sql);
			ConexaoFactory.close(conn, stat);
			System.out.println("Comprador atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void searchAll() {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "SELECT id,nome,cpf FROM agencia.comprador";
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				System.out.println(
						"id: " + rs.getInt("id") + " nome: " + rs.getString("nome") + " cpf: " + rs.getString("cpf"));
			}
			ConexaoFactory.close(conn, stat, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> searchByName(String name) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "SELECT id,nome,cpf FROM agencia.comprador where nome LIKE '%" + name + "%'";
		List<Comprador> listaComprador = new ArrayList<>();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				listaComprador.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, stat, rs);
			return listaComprador;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void selectMetaData() {
		String sql = "SELECT * FROM agencia.comprador";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int QntColunas = rsmd.getColumnCount();
			rs.next();
			System.out.println("Quantidade de colunas: " + QntColunas);
			for (int i = 1; i <= QntColunas; i++) {
				System.out.println("Coluna " + rsmd.getColumnName(i));
				System.out.println("Nome da tabela da coluna: " + rsmd.getTableName(i));
				System.out.println("Tamanho da coluna : " + rsmd.getColumnDisplaySize(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void checkDriverSuportted() {
		String sql = "SELECT * FROM agencia.comprador";
		Connection conn = ConexaoFactory.getConexao();
		try {
			DatabaseMetaData dbmd = conn.getMetaData();
//			Statement stat = conn.createStatement();
//			ResultSet rs = stat.executeQuery(sql);
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("Suporta TYPE_FORWARD_ONLY");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("Suporta CONCUR_UPDATABLE");
				}
			}
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("Suporta CONCUR_UPDATABLE");
				}
			}
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("Suporta CONCUR_UPDATABLE");
				}
			}
			ConexaoFactory.close(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void typeScroll() {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "SELECT * FROM agencia.comprador";
		try {
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stat.executeQuery(sql);
			rs.afterLast();
			while (rs.previous()) {
				System.out.print("Linha: " + rs.getRow());
				System.out.println(" id: " + rs.getInt("id") + " / nome: " + rs.getString("nome") + " / cpf: "
						+ rs.getString("cpf"));
			}
			System.out.println("---------------------");
			rs.first();
			System.out.println("Está depois da linha? " + rs.isAfterLast());
			System.out.println("É o primeiro da linha? " + rs.isFirst());
			rs.absolute(5);
			rs.relative(-3);
			System.out.println("Estou na linha: " + rs.getRow());
			System.out.println(
					"id: " + rs.getInt("id") + " / nome: " + rs.getString("nome") + " / cpf: " + rs.getString("cpf"));
			ConexaoFactory.close(conn, stat, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateUsingResultSet() {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "SELECT * FROM agencia.comprador";
		try {
			Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stat.executeQuery(sql);
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt("id") == 6) {
					rs.updateString("cpf", "000-000-000-00");
					rs.updateRow();
					continue;
				}
				rs.updateString("nome", rs.getString("nome").toUpperCase());
				rs.updateRow();
			}
			rs.absolute(3);
//			rs.moveToInsertRow();
//			rs.updateString("nome", "");
//			rs.updateString("cpf", "666-666-666-66");
//			rs.insertRow();
//			rs.moveToCurrentRow();
			System.out.println(rs.getRow());
			rs.last();
			rs.deleteRow();
			ConexaoFactory.close(conn, stat, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> searchByNamePreparedStatement(String name) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "SELECT id,nome,cpf FROM agencia.comprador where nome LIKE ?";
		List<Comprador> listaComprador = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + name + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				listaComprador.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, ps, rs);
			return listaComprador;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void updatePreparedStatement(Comprador c) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ? WHERE (`id` = ?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCpf());
			ps.setInt(2, c.getId());
			ps.executeUpdate();
			ConexaoFactory.close(conn, ps);
			System.out.println("Comprador atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> searchByNameCallableStatement(String name) {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "CALL `agencia`.`SP_GetSearchByName`(?)";
		List<Comprador> listaComprador = new ArrayList<>();
		try {
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, "%" + name + "%");
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				listaComprador.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, cs, rs);
			return listaComprador;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Comprador> searchByNameJdbcRowSet(String name) {
		JdbcRowSet jrs = ConexaoFactory.getConexaoJdbcRowSet();
		String sql = "SELECT * FROM agencia.comprador where nome LIKE ?";
		List<Comprador> listaComprador = new ArrayList<>();
		try {
			jrs.setCommand(sql);
			jrs.setString(1, "%" + name + "%");
			jrs.execute();
			while (jrs.next()) {
				listaComprador.add(new Comprador(jrs.getInt("id"), jrs.getString("cpf"), jrs.getString("nome")));
			}
			ConexaoFactory.close(jrs);
			return listaComprador;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void updateJdbcRowSet(Comprador c) {
		JdbcRowSet jrs = ConexaoFactory.getConexaoJdbcRowSet();
//		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ? WHERE (`id` = ?)";
		String sql = "SELECT * FROM agencia.comprador WHERE id LIKE ?";
		jrs.addRowSetListener(new MyRowSetListner());
		try {
			jrs.setCommand(sql);
			jrs.setInt(1, c.getId());
			jrs.execute();
			jrs.next();
			jrs.updateString("nome", c.getNome());
			jrs.updateString("cpf", c.getCpf());
			jrs.updateInt("id", c.getId());
			jrs.updateRow();
			ConexaoFactory.close(jrs);
			System.out.println("Comprador atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateCachedRowSet(Comprador c) {
		CachedRowSet crs = ConexaoFactory.getConexaoCachedRowSet();
//		String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ? WHERE (`id` = ?)";
		String sql = "SELECT * FROM comprador WHERE id LIKE ?";
		try {
			crs.setCommand(sql);
			crs.setInt(1, c.getId());
			crs.execute();
			crs.next();
			crs.updateString("nome", c.getNome());
			crs.updateString("cpf", c.getCpf());
			crs.updateInt("id", c.getId());
			crs.updateRow();
			crs.acceptChanges();
			System.out.println("Comprador atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void saveTransations() throws SQLException {
		Connection conn = ConexaoFactory.getConexao();
		String sql = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TESTE1', 'TESTE1')";
		String sql1 = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TESTE2', 'TESTE2')";
		String sql2 = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ('TESTE3', 'TESTE3')";
		Savepoint savepoint = null;
		try {
			Statement stat = conn.createStatement();
			conn.setAutoCommit(false);
			stat.executeUpdate(sql);
			savepoint = conn.setSavepoint("Save");
			stat.executeUpdate(sql1);
			savepoint = conn.setSavepoint("Save2");
			if(true)
				throw new SQLException();
			stat.executeUpdate(sql2);
			conn.commit();
			ConexaoFactory.close(conn, stat);
			System.out.println("Comprador inserido com sucesso!");
		} catch (SQLException e) {
			conn.rollback(savepoint);
			conn.commit();
			e.printStackTrace();
		}
	}
}