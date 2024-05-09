package String;

import java.net.MulticastSocket;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is my java code and I am so happy";
		System.out.println(str.length()); // space is also calculated in length
		
		int len = str.length();
		int li=0; // lowest index
		System.out.println(li);
		int hi=len-1; // highest index
		System.out.println(hi);
		
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38)); exception
		System.out.println(str.indexOf("a"));// always gives 1st occurance 
		System.out.println(str.indexOf("a", 13));// this is hardcoded value
		System.out.println(str.indexOf("a", str.indexOf("a")+1));// we can write this instead
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("vicky")); // gives -1 if string is not available
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// trim:
		String s="    hello world   ";
		System.out.println(s.trim()); // remove only before & after space
		
		//replace
		String dob="25-07-1993";
		System.out.println(dob.replace("-", "/"));
		
		//contains
		String s2="welcome admin";
		System.out.println(s2.contains("admin"));
		
		//concat
		String s3="vicky";
		String s4="jha";
		System.out.println(s3.concat(s4));
		//comparsion
		String s5="VICKY";
		String s6="vicky";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//substring
		String s7="this is my order id 12345";
		System.out.println(s7.substring(11));
		System.out.println(s7.substring(0, 9));// ending index is excluded
		
		System.out.println(s7.subSequence(s7.indexOf("id")+3,s7.length() ));
		
		//split
		String test="Java;Python;JavaScript;Ruby";
		String arr[]=test.split(";");
		System.out.println(arr[0]);
		for(String e:arr) {
			System.out.println(e);
		}
		
		String data ="xXtestingXxXxJavaxXselenium";
		String dataarr[]=data.split("xX");
		System.out.println("Oth value is:"+dataarr[0]); // output is nothing
		System.out.println("1st value is:"+dataarr[1]); 
		System.out.println("2nd value is:"+dataarr[2]); 
		System.out.println("3rd value is:"+dataarr[3]); 
		
		String x="100";
		System.out.println(x+20);
		int x1=Integer.parseInt(x); // only pure number value can be converted
		System.out.println(x1+20);
		
		
		
		}

}
