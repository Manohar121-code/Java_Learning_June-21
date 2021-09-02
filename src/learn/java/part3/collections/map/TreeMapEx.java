package learn.java.part3.collections.map;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
//		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(10, "Sachin");
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key + " - " + map.get(key));
		}
	}
}
