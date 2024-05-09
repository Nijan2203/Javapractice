package strings;

public class ClassJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="vicky";
		
		System.out.println(s.replaceAll("[aeiou]", "t")); // replace vowels with "t"
		System.out.println(s.replace("t", "i"));
		System.out.println(s.toUpperCase());

	}

}
