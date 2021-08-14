package learn.java.oops.wrapperClasses;

public class WrapperClassesEx {
	public static void main(String[] args) {
		int i = 10; //primitive
		Integer iObj = new Integer(i); //boxing
		
		System.out.println(i);
		System.out.println(iObj);
		
		int i2 = iObj; //unboxing
		System.out.println(i2);
		
		System.out.println("---------------------");
		
		double d = 8787.6566;
		Double dObj =  new Double(d);
		System.out.println(d);
		System.out.println(dObj);
		double d2 = dObj;
		System.out.println(d2);
	}
}
