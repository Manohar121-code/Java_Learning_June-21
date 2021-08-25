package learn.java.part3.collections.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListEx {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee naresh = new Employee(1, "Naresh");
		Employee mahesh = new Employee(2, "Mahesh");
		Employee suresh = new Employee(3, "Suresh");
		
		employeeList.add(naresh);
		employeeList.add(mahesh);
		employeeList.add(suresh);
		
		printElements(employeeList);
		
		employeeList.add(1, new Employee(4, "Sandeep"));
		
		printElements(employeeList);
		
		Employee emp = employeeList.get(2);
		System.out.println(emp);
	}
	
	private static void printElements(List<Employee> list) {
		System.out.println("------------------------------");
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("------------------------------");
	}
}
