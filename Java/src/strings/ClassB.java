package strings;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Vicky";
		
		System.out.println(s.charAt(1));
		System.out.println(s.concat("Jha"));
		System.out.println(s.contains("V"));
		System.out.println(s.length());
        System.out.println(s.substring(2));// returns substring from the mentioned index
        System.out.println(s.substring(1, 3));// start index is included and end index is not included
        System.out.println(s.toUpperCase());
	}

}
