package learn.java.oops;

public class StaticAndNonStaticEx {
	
	int id = 10;
	static String country = "India";
	
	public static void main(String[] args) {
		test();
		System.out.println(country);
	}
	
	public static void test() {
		System.out.println(country);
		System.out.println("static test() called");
	}
	
	public void sample() {
		System.out.println(id);
		System.out.println(country);
		test();
		sample2();
		System.out.println("non-static sample() called");
	}
	
	public void sample2() {
		System.out.println("non-static sample2() called");
	}
}
