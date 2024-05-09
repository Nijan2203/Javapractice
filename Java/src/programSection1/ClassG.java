package programSection1;

import java.util.Scanner;

public class ClassG {

	public static void main(String[] args) {
		// nested if else
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		System.out.println("Select the operation: \n 1. Addition \n 2. Substraction \n 3. Multiplication");
		int number=sc.nextInt();
		if(number==1) {
			System.out.println(a+b);
		}else if(number==2){
			System.out.println(a-b);
		}else if(number ==3) {
			System.out.println(a*b);
		}else
			System.out.println("Invalid input");
	}

}
