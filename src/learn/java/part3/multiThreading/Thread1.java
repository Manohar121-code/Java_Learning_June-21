package learn.java.part3.multiThreading;

public class Thread1 extends Thread {

	public void run() {
		for (int i = 1; i <= 99; i++) {
			System.out.println(i);
		}
	}
	
}
