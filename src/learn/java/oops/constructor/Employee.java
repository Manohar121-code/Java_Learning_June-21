package learn.java.oops.constructor;

public class Employee {
	int empId;
	String name;
	
	public Employee() {
		System.out.println("Employee Constructor called and object created");
	}

	public Employee(int empId, String name) {
		System.out.println("parameterized constructor called");
		this.empId = empId;
		this.name = name;
	}
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	public Employee(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
}
