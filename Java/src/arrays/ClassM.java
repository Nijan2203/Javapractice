package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ClassM {

	public static void main(String[] args) {
		// array asList - 3
		
		String a[]= {"vicky","kumar","jha"};
		
		System.out.println(Arrays.toString(a));
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.toString(a));
	}

}
