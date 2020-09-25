package br.com.abc.javacore.jdbc.teste;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.abc.javacore.jdbc.classe.Comprador;

public class CompradorCRUD {

	private static Scanner teclado = new Scanner(System.in);

	public static void executar(int op) {
		switch (op) {
		case 1:
			String nome = JOptionPane.showInputDialog("Nome:");
			String cpf = JOptionPane.showInputDialog("Cpf:");
			;
			Comprador c = new Comprador(cpf, nome);
			CompradorDAO.save(c);
			break;
		case 2:
			CompradorCRUD.listar();
			System.out.println("Digite o indice que deseja deletar:");
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja deletar: "));
			CompradorCRUD.deletar(opc);
			break;
		case 3:
			CompradorCRUD.listar();
			break;
		case 4:
			CompradorCRUD.listarPorNome(JOptionPane.showInputDialog("Procurar por nome: "));
			break;
		case 5:
			CompradorCRUD.atualizar();
			break;
		}
	}

	public static void listar() {
		List<Comprador> compradorList = CompradorDAO.searchAll();
		for (int i = 0; i < compradorList.size(); i++) {
			System.out.println("[" + i + "] " + compradorList.get(i));
		}
	}

	public static void deletar(int i) {
		List<Comprador> compradorList = CompradorDAO.searchAll();
		Comprador c = compradorList.get(i);
		CompradorDAO.delete(c);
	}

	public static void listarPorNome(String nome) {
		List<Comprador> compradorList = CompradorDAO.searchByName(nome);
		for (int i = 0; i < compradorList.size(); i++) {
			System.out.println("[" + i + "] " + compradorList.get(i));
		}
	}

	public static void atualizar() {
		listar();
		System.out.println("Digite o indice para atualizar: ");
		Comprador comprador = CompradorDAO.searchAll().get(teclado.nextInt());
		System.out.println("Aperte espaço para não atualizar o dado");
		String newName = JOptionPane.showInputDialog("Novo nome:");
		String newCpf = JOptionPane.showInputDialog("Novo cpf:");
		if (!newName.isEmpty()) {
			comprador.setNome(newName);
		}
		if (!newCpf.isEmpty()) {
			comprador.setCpf(newCpf);
		}
		CompradorDAO.update(comprador);

	}
}
