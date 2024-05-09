package arrays;

import java.util.Arrays;

public class ClassG {

	public static void main(String[] args) {
		// equals - compares the element one by one
		
		int a[]= {10,15,20};
		int b[]= {10,15,20};
		int c[]= {15,10,20};
		
		if(Arrays.equals(a, b)) 
			System.out.println("yes");
		else 
			System.out.println("No");
		if(Arrays.equals(a, c))
			System.out.println("yes");
		else 
			System.out.println("No");
		
		//primitive type
		Integer []d= {10,15,null,30};
		Integer []e= {10,15,null,30};
		if(Arrays.equals(d, e))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
