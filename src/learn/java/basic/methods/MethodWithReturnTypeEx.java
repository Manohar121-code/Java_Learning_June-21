package learn.java.basic.methods;

public class MethodWithReturnTypeEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int j = sample();
		System.out.println(j);
		
		System.out.println("--------------------");
		
		String s = test();
		System.out.println(s);
		
		System.out.println("Main ended");
	}

	public static int sample() {
		System.out.println("sample() called and returning int value");
		int i = 10;
		return i;
	}
	
	public static String test() {
		System.out.println("test() called and returning String value");
		return "java is a programming language";
	}
}
