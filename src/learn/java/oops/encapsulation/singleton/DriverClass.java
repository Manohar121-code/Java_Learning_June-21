package learn.java.oops.encapsulation.singleton;

public class DriverClass {
	public static void main(String[] args) {
		Test obj1 = Test.getObject();
		Test obj2 = Test.getObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
