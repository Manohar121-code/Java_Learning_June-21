package learn.java.oops.abstraction.interfaces.inheritance.multiple;

public class DriverClass2 implements Parent1, Parent2 {

	@Override
	public void m1() {
		
	}
	
	public static void main(String[] args) {
		Parent1 obj = new DriverClass2();
		obj.m1();
		
		
		Parent2 obj2 = new DriverClass2();
		obj2.m1();
	}

}
