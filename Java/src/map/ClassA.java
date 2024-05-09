package map;

import java.util.Map;
import java.util.TreeMap;

public class ClassA {

	public static void main(String[] args) {
		// map - stores in key & value pair . Map wont allow duplicate keys
		
		Map<Integer, String> m= new TreeMap<Integer, String> ();
		m.put(100, "vicky");
		m.put(200, "kumar");
		m.put(300, "jha");
		System.out.println(m.get(100));
		
		System.out.println(m);
		m.remove(100);
		System.out.println(m);
		System.out.println(m.get(100));
		System.out.println(m.containsKey(100));
		System.out.println(m.containsValue("jha"));
		m.replace(200, "vicky");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.keySet()); // return all the keys
		System.out.println(m.values()); // return all the values
		System.out.println(m.entrySet()); // returns in key value pairs
		System.out.println(m.getOrDefault(150, "not present")); // if presnt then returns the key else it returns the entered value

	}

}
