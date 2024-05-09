package Basics;

public class ClassJ {

	public static void main(String[] args) {
		// output
		
		int x=100; int y=200;
		System.out.println("Value of x is "+x);
		System.out.printf("Value of x is %d",x);
		System.out.format("Value of x is %d",x);
		System.out.format("Value of X is %d\n",x); // here \n is used in print next statement in new line  
		System.out.format("Value of X & Y is %d %d\n",x,y);

	// for other data types
		String str="GFG";
		System.out.format("Value of string is %s\n",str);
		char c='a';
		System.out.format("Value of C is %c\n",c);
	// printing customized output.
		
		float f=3.141592653589793f;
		System.out.println(f);
		System.out.format("Value of PI= %.3f\n", f);
		System.out.format("Value of PI= %5.4f\n", f);  // here "5" specified that we need to print 5 characters. Note space in the begining is included as 1st character.
		System.out.format("Value of PI= %05.2f\n", f);
	}

}

/*

format or printf - these are used to prin the formatted output like date, floating point values, customized floating point values .,

*/