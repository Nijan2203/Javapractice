package programSection1;

import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		// sum of N natural numbers
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
				int n=sc.nextInt();
				int sum=n*(n+1)/2;
				System.out.println(sum);

	}

}
