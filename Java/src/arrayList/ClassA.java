package arrayList;

import java.util.ArrayList;

public class ClassA {

	public static void main(String[] args) {
		// arrayList
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		System.out.println("==================");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("vicky");
		al.add("kumar");
		al.add("jha");
		System.out.println(al);
		al.add(0, "Mr");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.contains("jha"));
		al.remove("jha");
		System.out.println(al);
		System.out.println(al.contains("jha"));
		System.out.println(al.get(1));
		al.set(1, "jha");
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.indexOf("vicky"));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());

	}

}
