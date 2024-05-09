package elseIfStatement;

import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		// ladder if else
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("Positive number");
		
		if(number%2==0) 
			System.out.println("Even number");
		
		else 
			System.out.println("Odd number");
		}
		else if(number<0) {
			System.out.println("Negative number");
			if(number%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}

	}

}
