package learn.java.part3.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "Sachin");
		map.put(7, "Dhoni");
		map.put(10, "Tendulkar");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		map.put(null, "abc");
		map.put(null, "xyz");
		
		System.out.println(map);
	}
}
