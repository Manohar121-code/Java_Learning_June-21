package learn.java.basic.loops;

public class ForLoopEx {
	public static void main(String[] args) {
//		for(dec/init; condition; inc/dec) {
//			
//		}
		
		System.out.println("Main started");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("------------------");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("Main ended");
	}
}
