package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,10,20,30,15);
		
		List<Integer> evenList=li.stream()
		.filter(e -> e %2==0)
		.collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> odd=li.stream().filter( a -> a%2!=0)
		.collect(Collectors.toList());
		System.out.println(odd);
		
	}

}
