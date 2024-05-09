package javaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList - dynamc array
		
		ArrayList ar=new ArrayList(); // do not give same class name 
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
	}

}
