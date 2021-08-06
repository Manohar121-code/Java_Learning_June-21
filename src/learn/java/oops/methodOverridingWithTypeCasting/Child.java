package learn.java.oops.methodOverridingWithTypeCasting;

public class Child extends Parent {
	
	public void publicMethod() {
		System.out.println("Child publicMethod() called");
	}
	
//	public void finalMethod() {
//		System.out.println("Child finalMethod() called");
//	}
	
	static public void staticMethod() {
		System.out.println("Child staticMethod() called");
	}
}
