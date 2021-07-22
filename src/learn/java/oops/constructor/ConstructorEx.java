package learn.java.oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.empId = 2;
		obj.name = "Arjun";
		System.out.println(obj.empId);
		System.out.println(obj.name);
		
		System.out.println("-----------------");
		
		Employee obj2 = new Employee(1, "Mahesh");
		System.out.println(obj2.empId);
		System.out.println(obj2.name);
		
		System.out.println("---------------");
		
		Employee obj3 = new Employee(3);
		System.out.println(obj3.empId);
		System.out.println(obj3.name);
		
		System.out.println("---------------");
		
		Employee obj4 = new Employee("Vijay");
		System.out.println(obj4.empId);
		System.out.println(obj4.name);
	}
}
