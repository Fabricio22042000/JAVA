package br.com.abc.javacore.jdbc.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.abc.javacore.jdbc.classe.Carro;

public class TesteCRUD2 {

	public static void main(String[] args) {
		int op;
		while (true) {
			menu();
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: "));
			if (op == 0) {
				JOptionPane.showMessageDialog(null, "Saindo do programa");
				break;
			}
			executarOp(op);
		}
	}

	public static void executarOp(int op) {
		switch (op) {
		case 1:
			String placa = JOptionPane.showInputDialog("Digite uma placa: ");
			String nome = JOptionPane.showInputDialog("Digite um nome: ");
			CarroDAO.save(new Carro(placa, nome));
			break;
		case 2:
			listar();
			List<Carro> carroList = CarroDAO.searchAll();
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro: "));
			Carro c = carroList.get(opc);
			CarroDAO.delete(c);
			break;
		case 3:
			listar();
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione um carro"));
			Carro carro = CarroDAO.searchAll().get(opc);
			JOptionPane.showMessageDialog(null, "Digite espaço para não atualizar");
			placa = JOptionPane.showInputDialog("Digite uma placa: ");
			nome = JOptionPane.showInputDialog("Digite um nome: ");
			if (!placa.isEmpty()) {
				carro.setPlaca(placa);
			}
			if (!nome.isEmpty()) {
				carro.setNome(nome);
			}
			CarroDAO.update(carro);
			break;
		case 4:
			listar();
			break;
		case 5:
			placa = JOptionPane.showInputDialog("Digite a placa: ");
			carro = listarPorPlaca(placa);
			System.out.println("Carro com a placa: " + placa + carro.toString());
			break;

		}

	}

	public static Carro listarPorPlaca(String placa) {
		Carro carro = CarroDAO.searchByPlaca(placa);
		return carro;
	}

	public static void listar() {
		List<Carro> carroList = CarroDAO.searchAll();
		for (int i = 0; i < carroList.size(); i++) {
			System.out.println(
					"[" + i + "] " + "Nome: " + carroList.get(i).getNome() + " Placa: " + carroList.get(i).getPlaca());
		}
	}

	public static void menu() {
		System.out.println("----- MENU -----");
		System.out.println("(1) Inserir um carro");
		System.out.println("(2) Deletar um carro");
		System.out.println("(3) Atualizar um carro");
		System.out.println("(4) Listar todos os carros");
		System.out.println("(5) Listar carro por placa");
		System.out.println("(0) Sair do programa");
	}
}