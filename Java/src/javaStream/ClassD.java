package javaStream;

import java.util.Arrays;
import java.util.List;

public class ClassD {

	public static void main(String[] args) {
		// avg of all numbers
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		double avg=list.stream().mapToInt(a -> a).average().getAsDouble();
		System.out.println(avg);

	}

}
