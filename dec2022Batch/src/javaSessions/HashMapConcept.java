package javaSessions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stores value in key & value pair
		HashMap<String,String> empMap= new HashMap<String,String>();
		empMap.put("A", "Vicky");
		empMap.put("B", "Jha");
		System.out.println(empMap.get("B"));
		
		System.out.println(empMap.size());
		// default capacity of hashmap is 16
		
	}

}
