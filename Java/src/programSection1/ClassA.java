package programSection1;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// find odd or even number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2==0)
			System.out.println("Entered number is even number");
		else
			System.out.println("Entered number is odd number");
		
		
	}

}
