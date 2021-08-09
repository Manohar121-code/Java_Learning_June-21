package learn.java.oops.abstraction.abstractClasses;

public class AbstractClassEx {
	public static void main(String[] args) {
		Child obj1 = new Child();
		obj1.test();
		obj1.test2();
		
		System.out.println("--------------");
		
		Sample obj = new Child();//up casting
		obj.test();
		obj.test2();
	}
}
