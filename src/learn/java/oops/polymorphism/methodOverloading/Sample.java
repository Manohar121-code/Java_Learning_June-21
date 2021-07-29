package learn.java.oops.polymorphism.methodOverloading;

public class Sample {

	public void test() {
		System.out.println("test() called");
	}
	
	public void test(int i) {
		System.out.println("test(int i) called");
	}
	
	public void test(String s) {
		System.out.println("test(String s) called");
	}
	
	public void test(int i, String s) {
		System.out.println("test(int i, String s) called");
	}
	
	public void test(String s, int i) {
		System.out.println("test(String s, int i) called");
	}
	
}
