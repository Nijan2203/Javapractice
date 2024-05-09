package deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassD {

	public static void main(String[] args) {
		// traversing through dequeue - forward reversal

		Deque<Integer> d=new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		Iterator it=d.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
