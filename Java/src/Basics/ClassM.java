package Basics;

public class ClassM {

	public static void main(String[] args) {
		// Operators
// Arithmetic 
		
		int x=10;
		int y=20;
		
		System.out.println(x+y);
		System.out.println(x*y);
		System.out.println(y/x);
		int z=x+y*10;
		System.out.println(z); // if more than one operator,then precidence table is used to decide which operator to be used at 1st
		z=x++;
		System.out.println(z);
		z=++y;
		System.out.println(z);
		System.out.println("=============");
		
// assignment operator.(=, +=, -=, *=, %=)
		
		int a=10;
		int b=20;
		
		a+=b; // a=a+b
		System.out.println(a);
		a%=b;
		System.out.println(a);
		b=x=a; // we use two same operator, so here associativity is used. always right side operator is used 1st
		// instead of using two operator , specify the priority in bracket like x=y+(a+10)
		System.out.println(b);
		
// logical operator ( &&, || , ! )
		
				boolean x1=true;
				boolean y1=false;
				
				System.out.println(x1 && y1);
				System.out.println(x1 || y1);
				System.out.println(!y1);		
		
		
// Relational operartors( ==, <, >, <=, >=, !=) - it is used to compare two value and return the result.
				
				int x2=10;
				int y2=20;
				
				System.out.println(x2==y2);
				System.out.println(x2>y2);
				System.out.println(x2<y2);
				System.out.println(x2>=y2);
				System.out.println(x2<=y2);
				System.out.println(x2!=y2);		
		
	}

}
