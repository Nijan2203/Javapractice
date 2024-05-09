package javaSession;

public class ConditionalCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Find out the greatest number out of Three different given numbers:
//
//			Input the 1st number: 25 
//
//			Input the 2nd number: 78 
//
//			Input the 3rd number: 87
//
//		Expected Output :
//
//			The greatest﻿: 87

//		int i = 25;
//		int j = 78, k= 87;
//		
//		if(i>=j && i>=k){
//			System.out.println("The greatest: "+i);
//		}else if(j>=k) {
//			System.out.println("The greatest: "+j);
//		}else {
//			System.out.println("The greatest: "+k);
//		}
//		
//int a=50;
//int b=20;
//int c=30, d=40;
//
//int max=a;
//if(b>=max) {
//	max=b;
//} if(c>=max) {
//	max=c;
//} if(d>=max) {
//	max = d;
//}
//	System.out.println(max);	

//			Find out the greatest number out of four different given numbers:
//
//			Input the 1st number: 25 
//
//			Input the 2nd number: 78 
//
//			Input the 3rd number: 87
//
//			Input the 4th number: 97
//	Expected Output :
//
//		The greatest﻿: 97

//	int i = 25, l=97;
//	int j = 78, k= 87;
//	
//	if(i>=j && i>=k && i>=l){
//		System.out.println("The greatest: "+i);
//	}else if(j>=k && j>=l) {
//		System.out.println("The greatest: "+j);
//	}else if (k>=l){
//		System.out.println("The greatest: "+k);
//	}else {
//		System.out.println("The greatest: "+l);
//	}
//	

//		Write a Java program to test a number is positive or negative.
//
//		Test Data
//
//		Input number: 35 -- positive number
//
//		Input number: -11 -- negative number

		// int a = 35;
		int b = -11;

		if (b >= 0) {
			System.out.println("Input Number: " + b + " Positive Number");
		} else {
			System.out.println("Input Number: " + b + " Negative Number");
		}

//		WAP to check number is odd or even using If - Else
		int h = 1;

		// int a= h%2;

		if (h % 2 == 0) {
			System.out.println("Input is a Even number");
		} else {
			System.out.println("Input is a odd number");
		}

//		WAP to check given alphabet character is Vowel or Consonant using Switch - Case

		char vowel = 'z';
		switch (vowel) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println(vowel + " is Consonant");
			break;
		}

//		WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case

		String env = "uat";

		switch (env.toUpperCase()) {
		case "QA":
			System.out.println("This is a QA Env");
			break;
		case "STAGE":
			System.out.println("This is a Stage Env");
			break;
		case "DEV":
			System.out.println("This is a Dev Env");
			break;
		case "UAT":
			System.out.println("This is a UAT Env");
			break;
		case "PROD":
			System.out.println("This is a Prod Env");
			break;

		default:
			System.out.println("Given input is not a valid Env");
			break;
		}

//		WAP to book the specific type of car from the Uber app using Switch - Case. 
//
//		Car Type: Mini, Sedan, SUV, Premium
//
//		If user passes wrong car type, print please select the right car type

		String carty = "MINI";
		switch (carty.toLowerCase()) {
		case "mini":
			System.out.println("Mini car");
			break;
		case "sedan":
			System.out.println("Sedan car");
			break;
		case "suv":
			System.out.println("SUV car");
			break;
		case "premium":
			System.out.println("Premium car");
			break;

		default:
			System.out.println("please select the right car type");
			break;
		}

//		WAP to launch browsers using If-ElseIf and Switch Case.
//
//		Browser: Chrome/Firefox/IE/Safari
//
//		If user passes wrong browser, print please pass the right browser name

		String browser = "IE";
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome launch");
			break;
		case "Firefox":
			System.out.println("Firefox launch");
			break;
		case "IE":
			System.out.println("IE launch");
			break;
		case "Safari":
			System.out.println("Safari launch");
			break;

		default:
			System.out.println("please pass the right browser name");
			break;
		}

		System.out.println("----------------------------");

		if (browser.equals("Chrome")) {
			System.out.println("Chrome launch");
		} else if (browser.equals("Firefox")) {
			System.out.println("Firefox launch");
		} else if (browser.equals("IE")) {
			System.out.println("IE launch");
		} else if (browser.equals("Safari")) {
			System.out.println("Safari launch");
		} else {
			System.out.println("please pass the right browser name");
		}
		System.out.println("----------------------------");

//		WAP to define the interest rate on the basis of Loan type using Switch Case
//
//		Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//
//		For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan

		String loantye = "Housing Loan";
		switch (loantye) {
		case "Car Loan":
			System.out.println("Car Loan interest reat is modified");
			break;
		case "Housing Loan":
			int i = 36000;
			if (i < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				return;
			} else {
				System.out.println("Housing  Loan interest reat is modified");
			}
			break;
		case "Personal Loan":
			System.out.println("Personal Loan interest reat is modified");
			break;
		case "Education Loan":
			System.out.println("Education Loan interest reat is modified");
			break;

		default:
			System.out.println("Interest rate is not changed");
			break;
		}

	}

}
