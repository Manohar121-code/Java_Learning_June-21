package learn.java.part3.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEmployeeEx {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();
		
		Employee e1 = new Employee(1, "Kiran");
		Employee e2 = new Employee(2, "Sarath");
		Employee e3 = new Employee(1, "Kiran");
		Employee e4 = new Employee(4, "Jagadeesh");
		
		map.put(e1, 1000);
		map.put(e2, 1500);
		map.put(e3, 2000);
		map.put(e4, 5000);
		
		System.out.println(map);
		
		System.out.println("----------");
		
		Set<Employee> keySet = map.keySet();
		for (Employee key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+ " - " +value);
		}
	}
}
