package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassZ {

	public static void main(String[] args) {
		// Collections -min & max & frequency
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(20);
		
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);

	}

}
