package elseIfStatement;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// simple if else statement

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is even number");
		}else {
			System.out.println(number+" is an odd number");
		}
	}

}
