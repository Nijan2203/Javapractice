package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClassC {

	public static void main(String[] args) {
		// linkedHashset
		LinkedHashSet<Integer> s= new LinkedHashSet<Integer> ();
		s.add(10);
		s.add(30);
		s.add(20);
		s.remove(10);
		s.add(10);
		s.forEach(x -> System.out.println(x));
		
		// TreeSet
		
		TreeSet<String> t= new TreeSet<String>();
		t.add("vicky");
		t.add("kumar");
		t.add("jha");
		t.forEach(x -> System.out.println(x));
	}

}

/*
linkedHashset:
advantage is , it returns output in order(1st insertion order)

it also ignore duplicate value

TreeSet:
it returns items in sorted order
it also ignore duplicate value

*/