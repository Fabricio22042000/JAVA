package br.com.abc.javacore.classeAbstrata;

public class Vendedor extends Funcionario {

	private int totalVendas;
	
	
	public Vendedor(String nome, String clt, double salario, int totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}
	
	
	@Override
	public void calculaSalario() {
		double salarioFinal = super.getSalario() + (this.totalVendas * 0.05);
		super.setSalario(salarioFinal);
		System.out.println(super.getSalario());
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
}
