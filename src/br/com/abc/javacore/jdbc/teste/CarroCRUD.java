package br.com.abc.javacore.jdbc.teste;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.abc.javacore.jdbc.classe.Carro;
import br.com.abc.javacore.jdbc.classe.Comprador;

public class CarroCRUD {

	private static Scanner teclado = new Scanner(System.in);

	public static void executarOp(int op) {
		switch (op) {
		case 1:
			String placa = JOptionPane.showInputDialog("Digite uma placa: ");
			String nome = JOptionPane.showInputDialog("Digite um nome: ");
			System.out.println("Escolha um dos compradores abaixo:");
			CompradorCRUD.listar();
			List<Comprador> listaComprador = CompradorDAO.searchAll();
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione o comprador: "));
			Comprador comprador = CompradorDAO.searchById(listaComprador.get(op).getId());
			CarroDAO.save(new Carro(placa, nome, comprador));
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
			CompradorCRUD.listar();
			String compradorId = JOptionPane.showInputDialog("Digite seu compradorId: ");
			if (!placa.isEmpty()) {
				carro.setPlaca(placa);
			}
			if (!nome.isEmpty()) {
				carro.setNome(nome);
			}
			if (!compradorId.isEmpty()) {
				comprador = CompradorDAO.searchAll().get(Integer.valueOf(compradorId));
				carro.setComprador(comprador);
			}
			CarroDAO.update(carro);
			break;
		case 4:
			listar();
			break;
		case 5:
			placa = JOptionPane.showInputDialog("Digite a placa: ");
			carro = listarPorPlaca(placa);
			if (carro != null) {
				System.out.println(carro.toString());
			}
			break;
		case 6:
			placa = JOptionPane.showInputDialog("Digite a placa: ");
			nome = JOptionPane.showInputDialog("Digite um nome: ");
			inserirCarroSemDono(placa, nome);
		case 7:
			carroList = CarroDAO.searchCarAvailable();
			System.out.println("Carros disponiveis: ");
			for (int i = 0; i < carroList.size(); i++) {
				System.out.println("(" + i + ") " + "Nome: " + carroList.get(i).getNome() + " / Placa: "
						+ carroList.get(i).getPlaca());
			}
		}

	}

	public static void inserirCarroSemDono(String placa, String nome) {
		Carro c = new Carro(placa, nome);
		CarroDAO.CarWithoutOwner(c);
	}

	public static void listar() {
		List<Carro> carroList = CarroDAO.searchAll();
		for (int i = 0; i < carroList.size(); i++) {
			System.out.println("[" + i + "] " + carroList.get(i));
		}
	}

	public static void deletar(int i) {
		List<Carro> carroList = CarroDAO.searchAll();
		Carro c = carroList.get(i);
		CarroDAO.delete(c);
	}

	public static Carro listarPorPlaca(String placa) {
		Carro carro = CarroDAO.searchByPlaca(placa);
		return carro;
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
