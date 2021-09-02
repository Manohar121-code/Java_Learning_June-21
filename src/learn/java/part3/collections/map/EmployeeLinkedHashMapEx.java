package learn.java.part3.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeLinkedHashMapEx {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new LinkedHashMap<Employee, Integer>();
		
		Employee e1 = new Employee(1, "Kiran");
		Employee e2 = new Employee(2, "Sarath");
		Employee e3 = new Employee(1, "Kiran");
		Employee e4 = new Employee(4, "Jagadeesh");
		
		map.put(e1, 1000);
		map.put(e2, 1500);
		map.put(e3, 2000);
		map.put(e4, 5000);
		
		Set<Employee> keySet = map.keySet();
		for (Employee employee : keySet) {
			System.out.println(employee + " - "+ map.get(employee));
		}
	}
}
