package Streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,5,6,8,4,7,5,6,5,2,7);
		double avg=li.stream().mapToInt(e -> e).average().getAsDouble();
	System.out.println(avg);
	}

}
