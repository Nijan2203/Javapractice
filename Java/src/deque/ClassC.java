package deque;

import java.util.Deque;
import java.util.LinkedList;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> d=new LinkedList<Integer>();
		d.addFirst(10); //10
		d.addLast(20); // 10 20
		d.addFirst(30); //30 10 20
		d.addLast(40);  //30 10 20 40 
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		d.removeFirst();
		d.removeLast();
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
	}

}
