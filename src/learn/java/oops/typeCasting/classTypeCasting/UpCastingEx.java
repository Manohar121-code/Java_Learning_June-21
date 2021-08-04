package learn.java.oops.typeCasting.classTypeCasting;

public class UpCastingEx {
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent p = c1; //upcasting
		
		Parent obj = new Child();//upcasting
		obj.m1();
		obj.m2();
		
		System.out.println("------------");
		
		Child obj2 = new Child();
		obj2.m1();
		obj2.m2();
		obj2.m3();
	}
}
