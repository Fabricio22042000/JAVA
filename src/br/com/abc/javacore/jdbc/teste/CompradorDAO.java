package br.com.abc.javacore.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.jdbc.classe.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

public class CompradorDAO {

	public static void save(Comprador c) {
		String sql = "INSERT INTO `agencia`.`comprador` (`nome`, `cpf`) VALUES ( ?, ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, c.getNome());
			ps.setString(2, c.getCpf());
			ps.executeUpdate();
			System.out.println("Comprador inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(Comprador c) {
		String sql = "UPDATE `agencia`.`comprador` SET `nome` = ?, `cpf` = ? WHERE (`id` = ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, c.getNome());
			ps.setString(2, c.getCpf());
			ps.setInt(3, c.getId());
			ps.executeUpdate();
			System.out.println("Comprador atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete(Comprador c) {
		String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, c.getId());
			ps.executeUpdate();
			System.out.println("Comprador deletado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> searchAll() {
		String sql = "SELECT id,nome,cpf FROM agencia.comprador";
		List<Comprador> compradorList = new ArrayList<>();
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return compradorList;
	}

	public static Comprador searchById(Integer id) {
		String sql = "SELECT * FROM agencia.comprador where id = ?";
		Comprador comprador = null;
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				comprador = new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"));
			}
			ConexaoFactory.close(conn, ps, rs);
			return comprador;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Comprador> searchByName(String name) {
		String sql = "SELECT * FROM agencia.comprador where nome LIKE ?";
		List<Comprador> compradorList = new ArrayList<>();
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, '%'+name+'%');
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			}
			ConexaoFactory.close(conn, ps, rs);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
