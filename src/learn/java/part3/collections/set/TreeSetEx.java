package learn.java.part3.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(30);
		set.add(10);
		set.add(5);
		set.add(40);
		set.add(50);
		set.add(45);
		
		System.out.println(set);
		
		Set<String> set2 = new TreeSet<String>();
		set2.add("java");
		set2.add("python");
		set2.add("c");
		set2.add("c++");
		set2.add("golang");
		set2.add("cobol");
		
		System.out.println(set2);
		
		Set<Boolean> set3 = new TreeSet<>();
		set3.add(true);
		set3.add(false);
		
		System.out.println(set3);
	}
}
