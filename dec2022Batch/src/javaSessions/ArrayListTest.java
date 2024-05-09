package javaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Testing");
		ar.add(true);
		ar.add('a');
		ar.add(12.33);
		
		// generics in arraylist
		
		ArrayList<Integer> markList= new ArrayList<Integer>();
		
		markList.add(100);
		markList.add(200);
		
		System.out.println(markList.get(0));
		
		
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar.add(100);
		ar.add("Testing");
		ar.add(true);
		ar.add('a');
		ar.add(12.33);
		System.out.println(markList.get(0));
		
		ArrayList<String> nameList= new ArrayList<String>();
		nameList.add("vicky");
		nameList.add("jha");
		nameList.add("Mr.");
		// how to print all the values from arrayList
		
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		
		//for each loop
		
		for(Object e : nameList) {
			System.out.println(e);
		}
	}

}
