package learn.java.oops.abstraction.interfaces.inheritance.multilLevel;

public class MultiLevelInheritanceEx implements SubChild {

	@Override
	public void m1() {
		
	}
	
	@Override
	public void m2() {
		
	}

	@Override
	public void m3() {
		
	}
	
	public static void main(String[] args) {
		SubChild obj = new MultiLevelInheritanceEx();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
