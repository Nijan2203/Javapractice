package javaSession;

public class JavaAssignments {

	public static void main(String[] args) {

		
//		1. Write a Java program to add two strings:
//
//			String a = “Hello“;
//
//			String b = “Naveen K“
//
//			Expected Output :
//
//			Hello Naveen K
		
		String a ="Hello";
		String b = "Naveen K";
				
				
		System.out.println(a+" "+b);
		
		
		
//		2. Write a Java program to print the sum of two numbers.
//
//		Test Data:?.,
//
//		 74 + 36 
//
//		Expected Output:
//
//		110
		
		byte a1 = 74;
		
		byte b1 = 36;
		
		System.out.println(a1+b1);
		System.out.println(74+36);
		
		
//		 Write a Java program to print the division of two numbers.
//
//		k = 50/3
//
//		Expected Output : 
//
//		43 
//
//		16 — correct one
//
//		19
//
//		13
		
		
		int k =50/3;
		
		System.out.println(43);
		System.out.println(k+"--correct one");
		
	System.out.println(19);
	System.out.println(13);
	
//	 Write a Java program to compute the specified expressions and print the output. Go to the editor.
//
//	 Test Data:
//
//	 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//
//	 Expected Output
//
//	 2.138888888888889
	
	double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	
	System.out.println(d);
	
	
//	 Try to concat "Hello Selenium" with a character 't'.
	
	String e = "Hello Selenium";
	char r = 't';
	
	System.out.println(e+r);
	
//	Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//
//	"Your Total amount is. 3700".
	
			int i = 100;
			int j = 200;
			int z = 3400;
	
			int q = i+j+z;
			
			System.out.println("Your Total amount is. "+q);
			
//			Print the ASCII value of the character 'h'.
				char m = 'h';
				System.out.println((int)m);
				System.out.println((int)'h');
	
//			Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
				
				byte aa = 3;
				char bb = 'd';
				
				 byte cc = (byte)(aa+bb);
				 
				 System.out.println((char)cc);
				 
				
//				 Write a program to find the square of the number 3.9.
				 
				 float  o = 3.9f;
						 
						 System.out.println(o*o);
				
	
	}

}
