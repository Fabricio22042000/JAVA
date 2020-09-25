package br.com.abc.javacore.polimorfismo.classe;

public class Vendedor extends Funcionario {
	private int totalVendas;
	private double salarioFinal;
	
	
	
	public Vendedor(String nome, double salario, int totalVendas) {
		super(nome, salario);
		this.totalVendas = totalVendas;
	}
	
	

	public double getSalarioFinal() {
		this.salarioFinal = this.salario = this.salario + (this.totalVendas *0.05);
		return this.salarioFinal;
	}
	
	@Override
	public void calculaPagamento() {
		this.salario = this.salario + (this.totalVendas *0.05);
	}
	
	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
	
}
