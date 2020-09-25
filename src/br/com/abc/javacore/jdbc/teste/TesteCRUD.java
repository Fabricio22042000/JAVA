package br.com.abc.javacore.jdbc.teste;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.abc.javacore.jdbc.classe.Comprador;

public class TesteCRUD {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int op;
		while (true) {
			menu();
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: "));
			if (op == 0) {
				JOptionPane.showMessageDialog(null, "Saindo do programa");
				teclado.close();
				break;
			}else if(op == 1) {
				menuComprador();
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:"));
				CompradorCRUD.executar(op);
			}else if(op == 2) {
				menuCarro();
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:"));
				CarroCRUD.executarOp(op);
			}
		}
	}
	
	public static void menu() {
		System.out.println("Selecione uma opção:");
		System.out.println("1. Comprador");
		System.out.println("2. Carro");
		System.out.println("0. Sair");
	}

	public static void menuComprador() {
		System.out.println("----- MENU -----");
		System.out.println("(1) Inserir comprador");
		System.out.println("(2) Deletar comprador");
		System.out.println("(3) Listar compradores");
		System.out.println("(4) Listar compradores por nome");
		System.out.println("(5) Atualizar comprador");
		System.out.println("(9) Voltar");
	}

	public static void menuCarro() {
		System.out.println("----- MENU -----");
		System.out.println("(1) Inserir um carro");
		System.out.println("(2) Deletar um carro");
		System.out.println("(3) Atualizar um carro");
		System.out.println("(4) Listar todos os carros");
		System.out.println("(5) Listar carro por placa");
		System.out.println("(6) Inserir carro disponível");
		System.out.println("(7) Listar carros disponiveis");
		System.out.println("(0) Voltar");
	}
}
