package learn.java.part3.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(20);
		set.add("java");
		set.add(true);
		set.add('L');
		set.add(30);
		
		System.out.println(set);
		
		set.add(20);
		set.add("java");
		
		System.out.println(set);
		
		int size = set.size();
		System.out.println(size);
		
		System.out.println("----------");
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("----------");
		
		set.remove(20);
		
		System.out.println(set);
		
		System.out.println(set.contains('R'));
	}
}
