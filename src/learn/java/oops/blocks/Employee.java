package learn.java.oops.blocks;

public class Employee {
	int empId;
	String name;
	static String companyName;

	static {
		companyName = "Oracle";
		System.out.println("Employee's static block executed");
	}
	
//	static {
//		System.out.println("static2 is executed");
//	}
	
	{
		empId = 1;
		name = "Tarun";
		System.out.println("non-static block is executed");
	}
	
	{
		System.out.println("non-static block2 is executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main() executed");
		System.out.println("Company name - "+ companyName);
	}
	
}
