package arrayList;

import java.util.ArrayList;

public class ClassC {

	public static void main(String[] args) {
		// arrayList traversal - 2
		ArrayList<String> al=new ArrayList<String>();
		al.add("vicky");
		al.add("kumar");
		al.add("jha");
		
		for(String s:al) {
			System.out.println(s);
		}

	}

}
