package learn.java.part3.multiThreading;

public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Main started");
		Thread1 t1 = new Thread1();
		t1.start();
		
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}
		
		System.out.println("Main ended");
	}
}
