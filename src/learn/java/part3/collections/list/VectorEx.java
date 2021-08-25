package learn.java.part3.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		List list = new Vector();
		
		list.add(10);
		list.add("java");
		list.add(true);
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println(list);
		
		String s = (String) list.get(1);
		System.out.println(s);
		
		System.out.println(list);
		list.add(1, '#');
		
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add(50);
		list2.add("Python");
		
		list.addAll(list2);
		System.out.println(list);
		
		list.addAll(1, list2);
		System.out.println(list);
		
//		list.clear();
//		
//		System.out.println(list.size());
//		System.out.println(list);
		
		boolean contains = list.contains("c++");
		System.out.println(contains);
		
		int indexOfHash = list.indexOf('#');
		System.out.println(indexOfHash);
		
		System.out.println("is Empty? - "+ list.isEmpty());
		
		list.add("java");
		list.add('#');
		list.add(10);
		
		System.out.println(list);
		
		int lastIndexOf = list.lastIndexOf("java");
		System.out.println("Last index of java - "+ lastIndexOf);
		
		list.add(3);
		System.out.println(list);
		
		Integer intObj = new Integer(3);
		list.remove(intObj);
		System.out.println(list);
		
		List list3 = new ArrayList();
		list3.add("java");
		list3.add("Python");
		list3.add(10);
		
		list.removeAll(list3);
		System.out.println(list);
		
		list.set(1, "c++");
		System.out.println(list);
		
		List subList = list.subList(1, 3);
		System.out.println(subList);
		
		System.out.println("------- Iterating elements by Iterator --------");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object next = itr.next();
			System.out.println(next);
		}
		System.out.println("-----------------");
		
		System.out.println("----------- Iterating by normal for loop by index ----------");
		for(int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			System.out.println(object);
		}
		
		System.out.println("----------- loop elements by for each -----------");
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
