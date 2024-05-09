package javaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassG {

	public static void main(String[] args) {
		// print number starts with 2
		
		List<Integer> list=Arrays.asList(2,222,567,341,558,2685,3669,2107);

		List<Integer> number=list.stream()
		.map( a -> String.valueOf(a))
		.filter( b -> b.startsWith("2"))
		.map(Integer::valueOf).collect(Collectors.toList());
		
		System.out.println(number);

	}

}
