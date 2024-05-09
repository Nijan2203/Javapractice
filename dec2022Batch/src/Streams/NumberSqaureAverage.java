package Streams;

import java.util.Arrays;
import java.util.List;

public class NumberSqaureAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li= Arrays.asList(1,10,20,30,15);

		//1 100 400 900 225
		// get > 100
		// average  1525/3=508.333
		
		double avg =li.stream().map(e -> e*e).filter(e -> e >100).mapToInt(e -> e)
		.average().getAsDouble();
		
		System.out.println(avg);
		
		
	}

}
