package elseIfStatement;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {
		// Nested if else statement
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int number=sc.nextInt();
		if(number<18) {
			System.out.println("Minor");
		}else if(number>=18 && number<=70) {
			System.out.println("License granted");
		}else {
			System.out.println("Maximum age crossed");
		}

	}

}
