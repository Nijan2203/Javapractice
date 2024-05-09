package strings;

public class ClassF {

	public static void main(String[] args) {
		// String builder & buffer
		
		String s1="vicky";
		String s2=s1;
		s1=s1+"Kumar";// it create a new memory location
		if(s1==s2)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		StringBuilder sb1=new StringBuilder("vicky");
		StringBuilder sb2=sb1;
		sb1=sb1.append("Kumar");// it is mutable. so here it modifies in same memory location
		if(sb1==sb2)
			System.out.println("Same");
		else
			System.out.println("Not same");
		

	}

}
