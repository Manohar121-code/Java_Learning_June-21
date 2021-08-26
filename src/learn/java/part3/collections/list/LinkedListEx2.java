package learn.java.part3.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("c");
		list.add("c++");
		
		System.out.println(list);
		
		list.addFirst("Java");
		
		System.out.println(list);
		
		list.addLast("Cobal");
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		list.removeLast();
		
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("----------");
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
