package learn.java.part3.collections.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCricketerEx {
	public static void main(String[] args) {
		Map<Cricketer, Integer> map = new TreeMap<Cricketer, Integer>();
		
		Cricketer sachin = new Cricketer(10, "Sachin Tendulkar", 1);
		Cricketer dhoni = new Cricketer(7, "Mahendra Singh Dhoni", 3);
		Cricketer kohli = new Cricketer(18, "Virat Kohli", 2);
		Cricketer rohit = new Cricketer(45, "Roht Sharma", 4);
		
		map.put(sachin, 76576757);
		map.put(dhoni, 87687);
		map.put(kohli, 654657677);
		map.put(rohit, 8768767);
		
		Set<Cricketer> keySet = map.keySet();
		for (Cricketer cricketer : keySet) {
			System.out.println(cricketer + " - " + map.get(cricketer));
		}
	}
}
