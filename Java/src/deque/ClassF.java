package deque;

import java.util.ArrayDeque;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		ad.forEach( x -> System.out.println(x));

	}

}
