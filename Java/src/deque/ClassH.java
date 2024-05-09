package deque;

import java.util.PriorityQueue;

public class ClassH {

	public static void main(String[] args) {
		// priority queue

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); 
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		
		System.out.println(pq.peek()); // removes the top item 
		System.out.println(pq.poll()); // removes the top item and return removed item
		System.out.println(pq.peek());
		
	}

}
