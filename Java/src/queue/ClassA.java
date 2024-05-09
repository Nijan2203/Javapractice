package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer> ();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
		q.forEach(x -> System.out.println(x));
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println("===========");
		System.out.println(q.peek()); // return 1st time in the queue
		System.out.println(q.poll()); // removed the 1st item and returns the removed item
		System.out.println(q.peek());
	}

}
