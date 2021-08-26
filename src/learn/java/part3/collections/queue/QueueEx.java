package learn.java.part3.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(50);
		
		Integer peek = queue.peek(); //it will return head element
		System.out.println("peek element - "+ peek);
		
		Integer poll = queue.poll(); //it will remove and return head element
		System.out.println("polled element - "+ poll);
		
		Integer peek2 = queue.peek(); //it will return head element
		System.out.println("peek element after poll - "+ peek2);
		
		queue.add(30);
		queue.add(60);
		queue.add(75);
		
		Iterator<Integer> iterator = queue.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("-------------");
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		
		System.out.println("--------------------");
		while (queue.peek() != null) {
			Integer poll2 = queue.poll();
			System.out.println(poll2);
		}
		
		System.out.println("Queue size - "+queue.size());
	}
}
