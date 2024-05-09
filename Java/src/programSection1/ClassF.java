package programSection1;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		// Biggest of 3 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int c=sc.nextInt();
		if(a>b && a>c ) {
			System.out.println( a+" number is bigger");
		}else if(b>c && b>a) {
			System.out.println( b+" number is bigger");
		}else {
			System.out.println(c+" number is bigger");
		}
		
	}

}
