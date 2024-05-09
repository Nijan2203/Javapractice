package set;

import java.util.HashSet;
import java.util.Iterator;

public class ClassB {

	public static void main(String[] args) {
		// hashSet
		
		HashSet<String> hs= new HashSet<String>();

		hs.add("vicky");
		hs.add("kumar");
		hs.add("jha");
		hs.forEach( x -> System.out.println(x));
		System.out.println(hs.contains("jha"));
		System.out.println(hs.size());
		hs.remove("jha");
		System.out.println(hs.size());
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
