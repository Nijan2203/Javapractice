package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,5,6,8,4,7,5,6,5,2,7);
		
		Optional<Integer>sum=li.stream().reduce((a,b) -> a+b);
		System.out.println(sum.get());
	}

}
