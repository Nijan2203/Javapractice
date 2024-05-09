package arrays;

import java.util.Arrays;
import java.util.List;

public class ClassL {

	public static void main(String[] args) {
		// array asList - 2
		
		String a[]= {"vicky","kumar","jha"};
		
		List<String> l= Arrays.asList(a);
		a[0]="Suraj";
		System.out.println(l);
		l.set(1, "kr");
		System.out.println(l);
		System.out.println(Arrays.toString(a));// note - the changes made is the list is reflected in array also
		
	}

}
