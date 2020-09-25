package br.com.abc.javacore.classeAbstrata;

public class Gerente extends Funcionario {
	
	
	
	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
	}

	
	@Override
	public void calculaSalario() {
		double salarioFinal = super.getSalario() * 1.10;
		super.setSalario(salarioFinal);
		System.out.println(super.getSalario());
	}
	
}
