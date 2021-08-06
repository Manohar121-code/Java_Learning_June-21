package learn.java.oops.methodOverridingWithTypeCasting;

public class Parent {

	public void publicMethod() {
		System.out.println("Parent publicMethod() called");
	}
	
	private void privateMethod() {
		System.out.println("Parent privateMethod() called");
	}
	
	final public void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	static public void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
}
