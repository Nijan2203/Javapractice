package set;

import java.util.HashSet;
import java.util.Set;

public class ClassA {

	public static void main(String[] args) {
		// Set
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(20); // it does not add duplicate items
		s.add(40);
		
		s.forEach(x -> System.out.println(x));

	}

}

/*
it does not gives output in order

*/
