package deque;

import java.util.ArrayDeque;

public class ClassA {

	public static void main(String[] args) {
		// Stack in java - in single thread environment we must use this
		
		ArrayDeque<Integer> s=new ArrayDeque<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		s.forEach(x -> System.out.println(x));
		System.out.println("============");
		System.out.println(s.peek()); // peek gives top of the stack
		System.out.println(s.pop()); // it removed the top of the stack (so here 30 is removed) and then return the removed stack
		System.out.println(s.peek()); // 30 is already removed and so 20 is returned
		System.out.println(s.size());
		System.out.println(s.isEmpty());

	}

}

