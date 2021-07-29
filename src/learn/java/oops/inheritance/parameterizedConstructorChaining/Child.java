package learn.java.oops.inheritance.parameterizedConstructorChaining;

public class Child extends Parent {
	int id;

	public Child(int id) {
		System.out.println("Child constructor called");
		this.id = id;
	}
}
