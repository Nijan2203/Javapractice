package StringAssignments;

import java.util.jar.Attributes.Name;

public class StringAssignment {

	public static void main(String[] args) {
//		Write a program to check two different strings equality.

		String s = "Nijan";
		String a = "Nijan";

		if (s == a) {
			System.out.println("string equal");
		}

		if (s.equals(a)) {
			System.out.println("string equal");
		}

//			Remove all  spaces in a String . 
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
//		
		String s1 = "         Hello       Everyone            ";
		String s2 = s1.replaceAll(" ", "");
//		String s2 = s1.replaceAll("\\s", "");
		System.out.println(s2);

//		Write a program that will  print out the last character and first character of a word.

		String input = "Mijanthan";

		char[] ch = input.toCharArray();
		char fc = input.charAt(0);
		int lenght = input.length();
		char lc = input.charAt(input.length() - 1);
		System.out.println("last char: " + ch[lenght - 1] + " " + "First Char: " + ch[0]);
		System.out.println("last char: " + lc + " " + "First Char: " + fc);

//		Write a program to verify a word or a character contained in the sentence.

		String word = "Sample check with data";
		String s5 = "S";
		if (word.contentEquals(s5)) {
			System.out.println("content match");
		} else {
			System.out.println("content not match");
		}

//		5.Write a function/ method to reverse your own name.

		String Name = "Nijanthan";

		String[] a3 = Name.split("");
		int l = Name.length();

		for (int i = l - 1; i >= 0; i--) {
			System.out.print(a3[i]);
		}

//		Write a program that gives you the last half of the string.

		String sd = "Nijanthan";

//		String[]sds = sd.split("");

		int as3 = sd.length();

		System.out.println(sd.substring(as3 / 2));

//		7.Write a program to get the 3rd  “ e “ of the string .
		//
//			 For example: “Welcome to Naveen Automation Labs ! “.

		String sdr1 = "Welcome to Naveen Automation Labs";

		int a21 = sdr1.indexOf('e', sdr1.indexOf('e', sdr1.indexOf('e') + 1) + 1);
		System.out.println(a21);
		System.out.println(sdr1.indexOf('e', sdr1.indexOf('e', sdr1.indexOf('e', sdr1.indexOf('e') + 1)) + 1));

//		Write a method which gives an index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.

		String a1 = "Nijanthan Thangavel";
		String a2 = "Thangavel";
		if (a1 != a2) {
			System.out.println(a1.indexOf(a2));
		}

//		 Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) 
		String sre = "Hi I am Nijanthan Thangavel";
		String[] ar = sre.split("");
		System.out.println(ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("----------------------------------------------");

//		 Assume that a string consists of 3 words, print out the middle one. 
		String sre3 = "Hi I am your friend Nijanthan Thangavel";
		String[] ar1 = sre3.split(" ");
		int lg = ar1.length;
		System.out.println(lg);
		System.out.println(ar1[lg / 2]);

//		 get only numeric part from this String:
//
		String re = "your transaction id is: 12345 and reference id is 34567";

//		StringBuilder are = new StringBuilder(re);
		StringBuilder are2 = new StringBuilder();
		for (char c : re.toCharArray()) {
			if (Character.isDigit(c)) {
				are2.append(c);
			}

		}
		String result = are2.toString();
		System.out.println(result);

	}

}
