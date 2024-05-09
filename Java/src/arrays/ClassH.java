package arrays;

import java.util.Arrays;

public class ClassH {

	public static void main(String[] args) {
		// equals- 2nd method
		Integer a[]= {10,20,30,40,60};
		Integer b[]= {30,40,60,50,20};
		
		if(Arrays.equals(a,2,5,b,0,3))// a=30,40,60 & b=30,40,60
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
