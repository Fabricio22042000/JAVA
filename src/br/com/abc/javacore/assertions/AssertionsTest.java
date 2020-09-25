package br.com.abc.javacore.assertions;

public class AssertionsTest {

	public static void main(String[] args) {
		
		calculaSalario(-1000);

	}
	
	private static void calculaSalario(double salario) {
		assert salario > 0: "Nçao pode digitar salario menor que 0: " + salario;
		//Continue this code;
	}
	
	public static void calcSalario(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}

	
	public void diasDaSemana(int dia) {
		switch(dia) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				assert false;
		}
	}
}
