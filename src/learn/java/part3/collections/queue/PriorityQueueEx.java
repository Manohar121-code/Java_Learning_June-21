package learn.java.part3.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(5);
		queue.add(20);
		queue.add(45);
		
		System.out.println(queue);
		
		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue.isEmpty());
	}
}
