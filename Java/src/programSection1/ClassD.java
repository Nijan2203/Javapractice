package programSection1;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {
		// find the last digits of a given number
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();	
		int lastDigit=number%10;
		System.out.println("The last digit in the entered number is:"+lastDigit);
	}

}
