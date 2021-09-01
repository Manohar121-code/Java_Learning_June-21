package learn.java.part3.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		System.out.println("************* GOING FORWARD *************");
		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
			System.out.println(integer);
		}
		
		System.out.println("************* GOING BACKWARD *************");
		while (listIterator.hasPrevious()) {
			Integer previous = listIterator.previous();
			System.out.println(previous);
		}
	}
}
