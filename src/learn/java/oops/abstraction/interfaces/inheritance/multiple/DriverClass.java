package learn.java.oops.abstraction.interfaces.inheritance.multiple;

public class DriverClass implements ChildInterface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		ChildInterface obj = new DriverClass();
		obj.m1();
		obj.m2();
	}
}
