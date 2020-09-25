package br.com.abc.javacore.polimorfismo.classe;

public class RelatorioPagamento {
	
	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario: " + funcionario.getSalario());
		if(funcionario instanceof Gerente) {
			System.out.println("Participação no lucro: " + ((Gerente) funcionario).getPnl() );
			System.out.println("Salario Final: " + ((Gerente)funcionario).getSalarioFinal() );
		}else {
			System.out.println("Total de Vendas: " + ((Vendedor)funcionario).getTotalVendas() );
			System.out.println("Salario Final: " + ((Vendedor)funcionario).getSalarioFinal() );
		}
	}
}
