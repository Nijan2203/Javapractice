package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassE {

	public static void main(String[] args) {
		// print odd & even numbers
		
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		List<Integer> even=list.stream().filter(a -> a%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> odd=list.stream().filter( b ->b%2!=0).collect(Collectors.toList());
		System.out.println(odd);

	}

}
