package Basics;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		// ladder if
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("Positive");
		if(number%2==0) 
			System.out.println("Even");
		else 
			System.out.println("Odd");
		}
		else if(number <0) {
			System.out.println("Negative");
		if(number%2==0) 
			System.out.println("Even");
		else 
			System.out.println("Odd");
		}
		else {
			System.out.println("Invalid input");
		}
}
}
