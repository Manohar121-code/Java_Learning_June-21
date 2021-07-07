package learn.java.basic.methods;

public class MethodWithReturnTypeAndArgument {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int j = demo(10);
		System.out.println(j);
		
		System.out.println("Main ended");
	}
	
	public static int demo(int i) {
		System.out.println("demo() is called");
		i++;
		return i;
	}
}
