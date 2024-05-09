package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassY {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>(); 
		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(Collections.binarySearch(li, 20));
		System.out.println(Collections.binarySearch(li, 40));
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
		System.out.println(Collections.frequency(li, 20));

	}

}
