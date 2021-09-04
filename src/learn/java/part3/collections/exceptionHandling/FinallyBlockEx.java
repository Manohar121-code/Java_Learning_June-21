package learn.java.part3.collections.exceptionHandling;

public class FinallyBlockEx {
	public static void main(String[] args) {
		try {
			int div = 20/0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally executed for sure");
		}
	}
}
