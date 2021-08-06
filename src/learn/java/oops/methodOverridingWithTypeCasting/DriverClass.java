package learn.java.oops.methodOverridingWithTypeCasting;

public class DriverClass {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.publicMethod();
		p1.staticMethod();
		
		System.out.println("-----------");
		
		Child c1 = new Child();
		c1.publicMethod();
		c1.finalMethod();
		c1.staticMethod();
		
		System.out.println("-----------");
		
		Parent obj = new Child(); //upcasting
		obj.publicMethod();
		obj.finalMethod();
		obj.staticMethod();
		
		System.out.println("-----------");
		
		Parent.staticMethod();
		
		Parent p3 = null;
		p3.staticMethod();
		
		Child.staticMethod();
	}
}
