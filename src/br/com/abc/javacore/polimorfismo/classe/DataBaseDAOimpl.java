package br.com.abc.javacore.polimorfismo.classe;

public class DataBaseDAOimpl implements GerericDAO {

	@Override
	public void save() {
		System.out.println("Salvando no banco de dados");		
	}
	
	
}
