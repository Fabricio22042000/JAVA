package br.com.abc.javacore.polimorfismo.classe;

public class Gerente extends Funcionario {
	private double pnl;
	private double salarioFinal;
	
	
	
	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.pnl = pnl;
	}
	
	
	
	public double getSalarioFinal() {
		this.salarioFinal = this.salario + this.pnl;
		return this.salarioFinal;
	}



	@Override
	public void calculaPagamento() {
		this.salario = this.salario + this.pnl;
	}
	
	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}
	
	
}
