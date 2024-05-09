package set;

import java.util.TreeSet;

public class ClassD {

	public static void main(String[] args) {
		// additional functions in TreeSet
		// here features are only present in TreeSet
		TreeSet<Integer> t= new TreeSet<Integer>();
		t.add(10);
		t.add(5);
		t.add(2);
		t.add(1);
		t.add(15);
		System.out.println(t.lower(5));// gives the highest of smaller value ( 1 & 2 are smaller and 2 is the highest in smallest)
		System.out.println(t.higher(5));// gives the smallest of higher value ( 10 & 15 aer higher value and 10 is the smallest in  higher value)
		System.out.println(t.floor(5));// gives the small or equal to 5
		System.out.println(t.ceiling(5));// gives the greater than or equal to 5

	}

}
