package arrayList;

import java.util.ArrayList;

public class ClassB {

	public static void main(String[] args) {
		//arrayList traversal - 1
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("vicky");
		al.add("kumar");
		al.add("jha");
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}

}
