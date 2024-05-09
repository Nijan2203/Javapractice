package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ClassO {

	public static void main(String[] args) {
		// sorting array in decreasing order
		
		Integer arr[]= {1,15,8,55,60,4,7};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
