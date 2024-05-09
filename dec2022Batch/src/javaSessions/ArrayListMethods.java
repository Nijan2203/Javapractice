package javaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> ar= new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		System.out.println(ar);
		System.out.println(ar.size());
		ar.clear();
		
		System.out.println(ar);
		System.out.println(ar.size());

		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		System.out.println(ar1);
		ArrayList<String> ar2= (ArrayList<String>)ar1.clone(); // copy of arraylist
		System.out.println(ar2);
		
		//contains
		System.out.println(ar1.contains("D"));
		System.out.println(ar1.contains("C"));
		
		//INDEX
		System.out.println(ar1.indexOf("B"));
		
		//change default capacity of arrayList
		ArrayList<String> ar3= new ArrayList<String>(2);
		ar3.add("Test");
		ar3.add("Selenium");
		System.out.println(ar3);
		ar3.ensureCapacity(5); // to increase capacity from 2 to 5
		
		//for each
		ar1.forEach(a ->System.out.println(a));
		ar1.forEach(a -> System.out.println(a.toLowerCase()));
	
		
		//sorting
		ArrayList<String> empNames= new ArrayList<String>();
		empNames.add("vicky");
		empNames.add("hari");
		empNames.add("Rohit");
		empNames.add("manoj");
		System.out.println(empNames);
		Collections.sort(empNames);
		System.out.println(empNames);
		Collections.sort(empNames,Collections.reverseOrder());
		
		
		
		
	}

}
