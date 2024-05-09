package javaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// 
		
		int a=100;
		int b=200;
		String x="hello";
		String y="testing";
		
		System.out.println(a+b); // addition operator
		System.out.println(x+y); // concat operatot
		System.out.println(x+a);
		System.out.println(b+x);
		System.out.println(a+b+x+y); // execution starts from left to right
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(x+y+a+b+a+b);
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		System.out.println("the sum:"+a+b);
		System.out.println("the sum:"+(a+b));
		System.out.println(x+" "+y);
		char c1='a';
		char c2='b';
		System.out.println(c1+c2);
		System.out.println(c1+""+c2);
		System.out.println(10/2);
		System.out.println(10.0/2);
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(0/9);
		//System.out.println(0/0);
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(5/0.0);
		char c5='a';
		System.out.println((int)c5);
		
		

	}

}
