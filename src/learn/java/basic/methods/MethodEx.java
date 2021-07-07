package learn.java.basic.methods;

public class MethodEx {

//	<access_specifier> <static/non-static> <return_type> methodName(arguments) {
//		
//	}

	public static void main(String[] args) {
		System.out.println("Main started");
		
		test();
		
		System.out.println("Main ended");
	}
	
	public static void test() {
		System.out.println("test() is called");
	}

}
