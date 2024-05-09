package arrays;

import java.util.Arrays;

public class ClassF {

	public static void main(String[] args) {
		// Binary search in java  - binary search is used only in sorted array
		
		int a[]= {10,20,30,50,60};
		System.out.println(Arrays.binarySearch(a, 30));
		System.out.println(Arrays.binarySearch(a, 0,3,10));
		System.out.println(Arrays.binarySearch(a, 22));
	}
}
/*

if element not present  then it returns negative value . for above code
Formula: -(insertionPoint+1)
Example:
(arr,22) -> here 22 will get inserted at 2nd index.
so answer is -(2+1) = -3 

*/