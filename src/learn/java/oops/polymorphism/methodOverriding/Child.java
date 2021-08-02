package learn.java.oops.polymorphism.methodOverriding;

public class Child extends Parent {

	public void m1() {
		System.out.println("Child m1() called");
	}

	@Override
	public String toString() {
		return "Child []";
	}
}
