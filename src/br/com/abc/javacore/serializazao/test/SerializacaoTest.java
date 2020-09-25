package br.com.abc.javacore.serializazao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.abc.javacore.serializazao.classe.Aluno;
import br.com.abc.javacore.serializazao.classe.Turma;

public class SerializacaoTest {

	public static void main(String[] args) {
//		gravarObjeto();
		lerObjeto();
	}

	public static void gravarObjeto() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("folder/aluno.ser"))) {
			Aluno aluno = new Aluno(1L, "Fabricio", 20);
			Turma t = new Turma("Estudos sobre a linguagem JAVA!");
			aluno.setTurma(t);
			oos.writeObject(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerObjeto() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("folder/aluno.ser"))) {
			Aluno obj = (Aluno) ois.readObject();
			System.out.println(obj);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
