package br.com.abc.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ConexaoFactory {

	public static Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
		String user = "root";
		String password = "@rR32dDa";
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static JdbcRowSet getConexaoJdbcRowSet() {
		String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
		String user = "root";
		String password = "@rR32dDa";
		try {
			JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();
			jrs.setUrl(url);
			jrs.setUsername(user);
			jrs.setPassword(password);
			return jrs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static CachedRowSet getConexaoCachedRowSet() {
		String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&relaxAutoCommit=true";
		String user = "root";
		String password = "@rR32dDa";
		try {
			CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
			crs.setUrl(url);
			crs.setUsername(user);
			crs.setPassword(password);
			return crs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stat) {
		ConexaoFactory.close(conn);
		try {
			if (stat != null) {
				stat.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stat, ResultSet rs) {
		ConexaoFactory.close(conn, stat);
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(RowSet jrs) {
		try {
			if (jrs != null) {
				jrs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
