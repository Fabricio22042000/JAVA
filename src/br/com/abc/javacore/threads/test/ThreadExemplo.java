package br.com.abc.javacore.threads.test;

class ExemploThread implements Runnable {
	private String c;

	public ExemploThread(String c) {
		this.c = c;
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.print(c);
			if(i % 100 == 0) {
				System.out.println(c);
			}
		}
	}
}

public class ThreadExemplo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ExemploThread("A"));
		Thread t2 = new Thread(new ExemploThread("B"));
		Thread t3 = new Thread(new ExemploThread("C"));
		Thread t4 = new Thread(new ExemploThread("D"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
