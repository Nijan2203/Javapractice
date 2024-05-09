package arrays;

import java.util.Arrays;

public class ClassN {

	public static void main(String[] args) {
		// arrays sort - it can be used only for non primitive datatype
		
		int a1[]= {2,1,100,20,50};
		char []a2= {'z','d','a','g','w','b'};
		
		Arrays.sort(a1,2,5);
		System.out.println(Arrays.toString(a1));
		
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		
		Arrays.sort(a1,2,5);
		System.out.println(Arrays.toString(a1));
		

	}

}
