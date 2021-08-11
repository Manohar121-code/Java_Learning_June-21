package learn.java.oops.abstraction.interfaces.inheritance.simple;

public class ImplClass implements Child {

	@Override
	public void m1() {
		System.out.println("ImplClass m1() called");
	}

	@Override
	public void m2() {
		System.out.println("ImplClass m2() called");
	}
	
	
	public static void main(String[] args) {
		Parent obj = new ImplClass();
		obj.m1();
//		obj.m2();
		
		Child obj2 = new ImplClass();
		obj2.m1();
		obj2.m2();
	}

}
