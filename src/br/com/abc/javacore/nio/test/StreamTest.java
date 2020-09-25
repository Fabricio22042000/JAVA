package br.com.abc.javacore.nio.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) {
		gravadorTunado();
		leituraTunado();
	}

	public static void gravador() {
		try (FileOutputStream gravador = new FileOutputStream("folder/subfolder/stream.txt")) {
			byte[] bytes = { 66, 90, 50, 70, 20 };
			gravador.write(bytes);
			System.out.println("Escrito com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leitura() {
		try (FileInputStream leitura = new FileInputStream("folder/subfolder/stream.txt")) {
			int num;
			while ((num = leitura.read()) != -1) {
				byte b = (byte) num;
				System.out.print(" " + b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void gravadorTunado() {
		try (BufferedOutputStream gravadorTunado = new BufferedOutputStream(
				new FileOutputStream("folder/subfolder/stream.txt"), 4098)) {
			byte[] bytes = {50, 51, 52, 53, 54, 55 ,56, 57, 58, 59, 60};
			gravadorTunado.write(bytes);
			gravadorTunado.flush();
			System.out.println("Escrito com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leituraTunado() {
		try (BufferedInputStream leituraTunado = new BufferedInputStream(
				new FileInputStream("folder/subfolder/stream.txt"), 4098)) {
			int num;
			while ((num = leituraTunado.read()) != -1) {
				byte b = (byte) num;
				System.out.print(" " + b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
