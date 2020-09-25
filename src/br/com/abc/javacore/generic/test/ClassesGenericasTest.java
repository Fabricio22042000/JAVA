package br.com.abc.javacore.generic.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.coleções.classe.Produto;

public class ClassesGenericasTest {

	public static void main(String[] args) {
		List<Produto> listaProd = new ArrayList<>();
		listaProd.add(new Produto("123", "Alface", 10));
		listaProd.add(new Produto("456", "Notebook", 3000));

		ObjetoAlugavel<Produto> alugarObj = new ObjetoAlugavel<>(listaProd);
		Produto c = alugarObj.getObjetosDisponiveis();
		System.out.println("Não quero mais");
		alugarObj.devolverObjeto(c);
	}

}

class ObjetoAlugavel<T> {
	private List<T> listaObjetos;

	public ObjetoAlugavel(List<T> listaObjetos) {
		this.listaObjetos = listaObjetos;
	}

	public T getObjetosDisponiveis() {
		T obj = listaObjetos.remove(0);
		System.out.println("Pegando o objeto: " + obj);
		return obj;
	}

	public void devolverObjeto(T obj) {
		System.out.println("Devolvendo o Objeto: " + obj);
		this.listaObjetos.add(obj);
		System.out.println("Agora a lista de objetos disponiveis é: " + listaObjetos);
	}
}