package learn.java.basic.methods;

public class MethodWithArguments {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		test(20);
		
		System.out.println("-----------");
		
		demo(10, "java", 20);
		
		System.out.println("Main ended");
	}
	
	public static void test(int i) {
		System.out.println("test() with int argument is called");
		System.out.println(i);
	}
	
	public static void demo(int i, String s, int k) {
		System.out.println("test() with 3 arguments is called");
		System.out.println(i);
		System.out.println(s);
		System.out.println(k);
	}
}
