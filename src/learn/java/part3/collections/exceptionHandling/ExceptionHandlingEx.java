package learn.java.part3.collections.exceptionHandling;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		if (j != 0) {
			int div = i / j;
			System.out.println(div);
		} else {
			System.out.println("please enter valid digit to divide");
		}
		
		try {
			int div = i / j;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred please enter proper digit to divide");
		}
		
		System.out.println("Main ended");
		
	}
}
