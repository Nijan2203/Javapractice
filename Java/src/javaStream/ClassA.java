package javaStream;

import java.util.Arrays;
import java.util.List;

public class ClassA {

	public static void main(String[] args) {
		// if input is integer
		
		int a[]= {1,5,3,6,4,8,6,10};
		
		List<Integer> l=Arrays.asList(1,5,3,6,4,8,6,10);
		l.stream().forEach(x -> System.out.println(x));
		l.stream().distinct().forEach(x -> System.out.println(x)); // removed duplicate element 
		l.stream().distinct().sorted().forEach(x -> System.out.println(x)); // sort
		
		
		

	}

}
