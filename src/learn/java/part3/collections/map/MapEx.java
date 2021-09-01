package learn.java.part3.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		map.put(12, "Yuvraj");
		
		String name = map.get(12);
		System.out.println(name);
		
		if (map.containsKey(12)) {
			System.out.println(121+ " is available in map");
		} else {
			System.out.println(121+ " isn't available in map");
		}
		
		System.out.println(map);
		
		map.put(18, "Virat");
		
		System.out.println(map);
		
		System.out.println("-------------");
		
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			String value = map.get(key);
			System.out.println(key+ " - " +value);
		}
		System.out.println("--------------");
		for (Integer key : set) {
			String value = map.get(key);
			System.out.println(key+ " - " +value);
		}
		
		System.out.println("----------------------------");
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+ " - " +value);
		}
		
		System.out.println("-----------");
		
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println("---------");
		
		System.out.println(map.size());
		
//		map.clear();
//		
//		System.out.println(map.size());
		
		String orDefault = map.getOrDefault(121, "Singh");
		System.out.println(orDefault);
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(21, "Sachin");
		map2.put(22, "Dhoni");
		map2.put(45, "Sharma");
		
		map.putAll(map2);
		
		Set<Entry<Integer,String>> entrySet2 = map.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+ " - " +value);
		}
		
		String remove = map.remove(45);
		System.out.println(remove);
		
		System.out.println("---------");
		
		Set<Entry<Integer,String>> entrySet3 = map.entrySet();
		for (Entry<Integer, String> entry : entrySet3) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+ " - " +value);
		}
	}
}
