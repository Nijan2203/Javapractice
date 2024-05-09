package trickyQuestion;

import java.util.stream.IntStream;

public class ClassN {

	public static void main(String[] args) {
		// print 1 to 100 without using loop
		
		IntStream.range(1, 101).forEach(a -> System.out.println(a));

	}

}
