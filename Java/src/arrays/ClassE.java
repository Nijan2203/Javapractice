package arrays;

import java.util.Arrays;

public class ClassE {

	public static void main(String[] args) {
		// fill()
		int a[]= {10,20,30,40,50};
		Arrays.fill(a,-3);
		System.out.println(Arrays.toString(a));
		
		int a1[]= {50,40,20,30,10};
		Arrays.fill(a1, 3, 4, 5);  // from index is included and To index is not included
		System.out.println(Arrays.toString(a1));
	}

}
