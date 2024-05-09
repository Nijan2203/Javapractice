package linkedList;

import java.util.LinkedList;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		li.add(1, 15);
		System.out.println(li);
		li.remove(1);
		System.out.println(li);
		System.out.println(li.isEmpty());
		li.forEach(x -> System.out.println(x));
		
		for(Integer i:li) {
			System.out.println(i);
		}
	}

}
