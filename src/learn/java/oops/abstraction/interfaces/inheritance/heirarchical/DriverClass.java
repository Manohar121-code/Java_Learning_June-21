package learn.java.oops.abstraction.interfaces.inheritance.heirarchical;

public class DriverClass implements Child2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void m2() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public static void main(String[] args) {
		Child2 obj = new DriverClass();
		obj.m1();
		obj.m3();
	}

}
