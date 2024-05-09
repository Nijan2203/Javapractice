package map;

import java.util.LinkedHashMap;

public class ClassC {

	public static void main(String[] args) {
		// linkedHashMap
		
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();
		m.put(10, "vicky");
		m.put(20, "kumar");
		m.put(15, "jha");
		System.out.println(m);
		m.put(10,"suraj" ); // it replaces the 10
		System.out.println(m);
		m.remove(10,"suraj");
		m.put(10, "vicky");
		System.out.println(m);
	}

}
