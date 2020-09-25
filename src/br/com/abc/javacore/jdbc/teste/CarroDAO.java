package br.com.abc.javacore.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.jdbc.classe.Carro;
import br.com.abc.javacore.jdbc.classe.Comprador;
import br.com.abc.javacore.jdbc.conn.ConexaoFactory;

public class CarroDAO {

	public static void save(Carro c) {
		String sql = "INSERT INTO `agencia`.`carro` (`placa`, `nome`, compradorid) VALUES (?, ?, ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, c.getPlaca());
			ps.setString(2, c.getNome());
			ps.setInt(3, c.getComprador().getId());
			ps.executeUpdate();
			System.out.println("Carro inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void CarWithoutOwner(Carro c) {
		String sql = "INSERT INTO `agencia`.`carro` (`placa`, `nome`) VALUES (?, ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, c.getPlaca());
			ps.setString(2, c.getNome());
			ps.executeUpdate();
			System.out.println("Carro inserido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete(Carro c) {
		String sql = "DELETE FROM `agencia`.`carro` WHERE (`id` = ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, c.getId());
			ps.executeUpdate();
			System.out.println("Carro deletado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(Carro c) {
		String sql = "UPDATE `agencia`.`carro` SET `placa` = ?, `nome` = ?, compradorid = ? WHERE (`id` = ?)";
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, c.getPlaca());
			ps.setString(2, c.getNome());
			ps.setInt(3, c.getComprador().getId());
			ps.setInt(4, c.getId());
			ps.executeUpdate();
			System.out.println("Carro atualizado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Carro> searchAll() {
		String sql = "SELECT * FROM agencia.carro";
		List<Carro> carroList = new ArrayList<>();
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Comprador c = CompradorDAO.searchById(rs.getInt("compradorid"));
				carroList.add(new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome"), c));
			}
			ConexaoFactory.close(conn, ps, rs);
			return carroList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Carro searchByPlaca(String placa) {
		String sql = "SELECT * FROM agencia.carro where placa LIKE ?";
		Carro carro = null;
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, placa);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Comprador c = CompradorDAO.searchById(rs.getInt("compradorid"));
				carro = new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome"), c);
			}
			ConexaoFactory.close(conn, ps, rs);
			return carro;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Carro> searchCarAvailable() {
		String sql = "SELECT * FROM agencia.carro";
		List<Carro> carroList = new ArrayList<>();
		try (Connection conn = ConexaoFactory.getConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
					int compradorid = rs.getInt("compradorid");
					if(compradorid == 0) {
						carroList.add(new Carro(rs.getInt("id"), rs.getString("placa"), rs.getString("nome")));
					}
			}
			ConexaoFactory.close(conn, ps, rs);
			return carroList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
