package learn.java.oops.blocks;

import learn.java.oops.accessModifiers.Sample;

public class BlocksEx extends Sample {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		System.out.println(obj1.empId);
		System.out.println(obj1.name);
		
		System.out.println(obj2.empId);
		System.out.println(obj2.name);
	}
}
