package br.com.abc.javacore.coleções.classe;

public class Celular {
	private String nome;
	private String IMEI;

	// Reflexivo se x.equals(x) tem que ser true para tudo que for diferente de
	// null;
	// Simetrico se x e y for diferente de null, se x.equals(y) for true, logo
	// y.equals(x) tem que ser true;
	// Transitividade para x,y,z diferentes de null se x.equals(y) true logo
	// y.equals(x) tem que ser true e se x.equals(z) true, y.equals(z)
	// tambem tem que ser true;
	// Consistente x.equals(y) tem que sempre retornar o mesmo valor;
	// se x.equals(null) retornar sempre falso;

	public Celular(String nome, String iMEI) {
		this.nome = nome;
		this.IMEI = iMEI;
	}

	@Override
	public String toString() {
		return "Celular [nome=" + nome + ", IMEI=" + IMEI + "]";
	}

	@Override
	public int hashCode() {
		return IMEI != null ? IMEI.hashCode() : 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Celular outrocelular = (Celular) obj;
		return this.IMEI != null ? this.IMEI.equals(outrocelular.getIMEI()) : false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

}
