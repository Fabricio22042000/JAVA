package testes.equaltest.classe;

public class Pessoa {
	private String nome;
	private String rg;
	private int idade;

	public Pessoa(String nome, String rg, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Pessoa pessoa = (Pessoa) obj;
		if (!this.rg.equals("")) {
			if(this.getRg().equals(pessoa.getRg())){
				return true;
			}
		}
		return false;
// return this.rg != null ? this.getRg().equals(pessoa.getRg) : false;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
