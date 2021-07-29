package learn.java.oops.inheritance.parameterizedConstructorChaining;

public class SuperChild extends Child {
	public SuperChild(int id) {
		super(id);
		System.out.println("SuperChild constructor called");
	}
}
