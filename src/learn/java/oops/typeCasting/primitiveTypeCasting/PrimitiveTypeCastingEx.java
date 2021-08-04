package learn.java.oops.typeCasting.primitiveTypeCasting;

public class PrimitiveTypeCastingEx {
	public static void main(String[] args) {
		int i = 10;
		long l = i; //widening
		
		System.out.println(i);
		System.out.println(l);
		
		long l2 = 100;
		int i2 = (int) l2;
		
		System.out.println(l2);
		System.out.println(i2);
		
		char ch = '%';
		int i3 = ch;
		System.out.println(ch);
		System.out.println(i3);
	}
}
