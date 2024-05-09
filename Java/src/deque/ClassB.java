package deque;

import java.util.Deque;
import java.util.LinkedList;

public class ClassB {

	public static void main(String[] args) {
		Deque<Integer> d=new LinkedList<Integer>(); // Dequeue is an interface which is implemented by LinkedList class
		d.offerFirst(10); //10
		d.offerLast(20); //10 20
		d.offerFirst(30); //30 10 20
		d.offerLast(40); //30 10 20 40
		
		System.out.println(d.peekFirst()); // returns 1st element
		System.out.println(d.peekLast()); // returns last element
		d.pollFirst(); // removes 1st element
		d.pollLast(); // removes last element
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
	}

}
