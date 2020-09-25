package br.com.abc.javacore.classeAbstrata;

public abstract class Funcionario extends Pessoa {
	private String clt;
	private double salario;
	

	
	public Funcionario(String nome, String clt, double salario) {
		super(nome);
		this.clt = clt;
		this.salario = salario;
	}
	
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
