package deque;

import java.util.ArrayDeque;

public class ClassG {

	public static void main(String[] args) {
		// ArrayDeque
		
				ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
				ad.offerFirst(10); // 10
				ad.offerLast(20); //10 20 
				ad.offerFirst(30); // 30 10 20
				ad.offerLast(40); // 30 10 20 40
				
				System.out.println(ad.peekFirst());  //30
				System.out.println(ad.peekLast());  //40
				System.out.println(ad.pollFirst()); //30 - removes the 1st item and retruns the removed item - 10 20 40
				System.out.println(ad.peekFirst()); //10
				System.out.println(ad.pollLast()); // 40 - removes the last item and retruns the removed item - 10 20
				System.out.println(ad.peekLast()); // 20

	}

}
