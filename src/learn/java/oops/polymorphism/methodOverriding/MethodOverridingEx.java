package learn.java.oops.polymorphism.methodOverriding;

public class MethodOverridingEx {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		
		System.out.println("-----------");
		
		Child2 obj2 = new Child2();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
		System.out.println(obj);
		System.out.println(obj2);
	}
}
