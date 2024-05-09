package arrayList;

import java.util.ArrayList;

public class ClassD {

	public static void main(String[] args) {
		// arrayList traversal - 3
		ArrayList<String> al=new ArrayList<String>();
		al.add("vicky");
		al.add("kumar");
		al.add("jha");
		
		al.forEach(a -> System.out.println(a));

	}

}
