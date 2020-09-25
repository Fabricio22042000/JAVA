package br.com.abc.javacore.polimorfismo.classe;

public class ArquivoDAOimpl implements GerericDAO {

	@Override
	public void save() {
		System.out.println("Salvando dados no arquivo");		
	}

}
