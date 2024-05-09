package javaStream;

import java.util.Arrays;
import java.util.List;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=Arrays.asList(1,10,20,30,15);
		// 1  100  400 900  225
				// 400 900 225
				// 1525/3 = 508.3333
		
		double avg=list.stream()
		.map(a -> a*a)  // map means get each value from the list
		.filter(b -> b>100) // then filter it
		.mapToInt( b -> b) // convert map to integer
		.average() // average it
		.getAsDouble(); // get as double
		
		System.out.println(avg);
		
		
	}

}
