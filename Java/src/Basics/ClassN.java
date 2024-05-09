package Basics;

import java.util.Scanner;

public class ClassN {

	public static void main(String[] args) {
		// Program using logical operator
		
		String usrname="vicky";
		String password="jha";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username and password to login");
		String un=sc.next();
		String pwd=sc.next();
		if(un.equals(usrname) && password.equals(password))
			System.out.println("Logged IN");
		else
			System.out.println("Username or password is invalid");

	}

}

/*

&& - execute if both the condition is true
|| - execute if any1 condition is true


*/