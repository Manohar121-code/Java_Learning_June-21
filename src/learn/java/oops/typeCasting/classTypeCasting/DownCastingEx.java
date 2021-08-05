package learn.java.oops.typeCasting.classTypeCasting;

public class DownCastingEx {
	public static void main(String[] args) {
		Parent obj1 = new Child();//up casting
		
		Child obj = (Child) obj1;//down casting
		obj.m3();
		
		System.out.println("---------------");
		Parent p1 = new Parent();
		test(p1);
		
		Child c1 = new Child();
		test(c1);
		
		Parent p2 = new Child();
		test(p2);
	}
	
	public static void test(Parent p) {
		if (p instanceof Child) {
			System.out.println("********** if ********");
			Child c1 = (Child) p;
			c1.m3();
		} else {
			System.out.println("*********** else *******");
			p.m1();
		}
	}
}
