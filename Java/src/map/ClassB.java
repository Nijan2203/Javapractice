package map;

import java.util.HashMap;

public class ClassB {

	public static void main(String[] args) {
		// hashMap
		HashMap<String,Integer> m= new HashMap<String,Integer>();
		m.put("vicky", 10);
		m.put("kumar", 20);
		m.put("jha", 30);
		System.out.println(m);
		if(m.containsKey("jha"))
			System.out.println("yes");
		else
			System.out.println("no");
		System.out.println(m.size());
		System.out.println(m.get("vicky"));
		System.out.println(m.get("suraj"));
		

	}

}
