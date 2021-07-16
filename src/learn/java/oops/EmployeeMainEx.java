package learn.java.oops;

public class EmployeeMainEx {
	public static void main(String[] args) {
//		<class_name> <obj_name> = new <class_name>();
		Employee obj1 = new Employee();
		obj1.id = 10;
		obj1.name = "Mahesh";
		
		Employee obj2 = new Employee();
		obj2.id = 20;
		obj2.name = "Suresh";
		
		Employee obj3 = new Employee();
		obj3.id = 30;
		obj3.name = "Ganesh";
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		
		System.out.println(obj2.id);
		System.out.println(obj2.name);
		
		System.out.println(obj3.id);
		System.out.println(obj3.name);
		
	}
}
