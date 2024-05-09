package arrays;

import java.util.Arrays;

public class ClassJ {

	public static void main(String[] args) {
		// Array-Compare
		int a[]= {10,20,50};
		int b[]= {10,20,70};
		
		int res=Arrays.compare(a, b);
		if(res==0)
			System.out.println("same");
		else if(res>0)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");

	}

}
/*
this function compares two array to find
1. same or not
2. lexicographical greater

*/