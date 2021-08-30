package learn.java.part3.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(1);
		set.add("abc");
		set.add(true);
		set.add("abc");
		set.add(null);
		set.add(23.456);
		set.add(1);
		set.add(null);
		
		System.out.println(set);
		
		
	}
}
