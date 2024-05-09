package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClassI {

	public static void main(String[] args) throws IOException {
		// Input
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=read.readLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
/*

1. BufferReader & Scanner are used to read input from keyboard.
2. Scanner is much easier to use bcoz 
- we dont need to use Exception in our code
- Syntax is simpler

*/