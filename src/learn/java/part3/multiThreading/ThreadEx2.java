package learn.java.part3.multiThreading;

public class ThreadEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		
		Thread2 obj = new Thread2();
		Thread t1 = new Thread(obj);
		t1.setName("T1");
		t1.start();
		
//		t1.join();
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+ i);
		}
		
		System.out.println("Main ended");
	}
}
