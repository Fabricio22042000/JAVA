package br.com.abc.javacore.jdbc.classe;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;

public class MyRowSetListner implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
//		System.out.println("Comando execute executado");
	}

	@Override
	public void rowChanged(RowSetEvent event) {
//		System.out.println("Comando insert, delete, ou update");
		if(event.getSource() instanceof RowSet) {
			try {
				( (RowSet) event.getSource() ).execute();
//				System.out.println("Comando execute executado");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void cursorMoved(RowSetEvent event) {
//		System.out.println("Cursor moveu");
	}
	
}
