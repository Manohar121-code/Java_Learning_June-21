package learn.java.oops.polymorphism.methodOverloading;

public class MethodOverloadingEx {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.test();
		obj.test(10);
		obj.test("java");
		obj.test(1, "Arjun");
		obj.test("Arjun", 1);
	}
}
