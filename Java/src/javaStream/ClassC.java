package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ClassC {

	public static void main(String[] args) {
		// sum of numbers
		
		List<Integer> list=Arrays.asList(1,2,3,8,4,5,10);
		Optional<Integer> sum=list.stream().reduce((a,b) -> a+b);
		System.out.println(sum.get());
		
	}

}
