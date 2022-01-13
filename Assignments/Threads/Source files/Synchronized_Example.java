package Threads;

class d {
	public synchronized void add(int l) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(l + "X" + i + "=" + (i * l));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}

class d1 extends Thread {
	d d1;

	d1(d s) {
		d1 = s;
	}

	public void run() {
		d1.add(5);
	}
}

class d2 extends Thread {
	d d12;

	d2(d s) {
		d12 = s;
	}

	public void run() {
		d12.add(10);
	}
}

public class Synchronized_Example {

	public static void main(String[] args) throws Exception {

		d df = new d();
		d1 dg = new d1(df);
		d2 dh = new d2(df);
		dg.start();
		dh.start();
	}

}
