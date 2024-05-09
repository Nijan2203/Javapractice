package javaSession;

public class MethodsAndClassVeriable {

	String sr;
	int ag;
	char gen;
	boolean pr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Print the class variable data 

		MethodsAndClassVeriable ar = new MethodsAndClassVeriable();
		ar.sr = "Nijanthan";
		ar.ag = 28;
		ar.gen = 'M';
		ar.pr = true;

		System.out.println(ar.sr + " " + ar.ag + " " + ar.gen + " " + ar.pr);

		int ad = ar.add(10, 20);
		System.out.println(ad);
		int sb = ar.sub(20, 10);
		System.out.println(sb);
		int ml = ar.mul(10, 20);
		System.out.println(ml);
		int dv = ar.div(4, 2);
		System.out.println(dv);

		double dm = ar.doubmul(200.52, 100);
		System.out.println(dm);

		float crcm = ar.circleCircum(5);
		System.out.println(crcm);

		double cra = ar.circlearea(2.5);
		System.out.println(cra);

		int a = 15;
		int b = 20;
		int c = 100;
		int maxi = ar.max(a, b, c);
		System.out.println(maxi);
		int mini = ar.min(a, b, c);
		System.out.println(mini);

		boolean evenod = ar.evenOdd(51);
		if (evenod) {
			System.out.println("The Given Input is Even Number");
		} else {
			System.out.println("The Given Input is Odd Number");
		}

		boolean voteage = ar.voteage(100);
		if (voteage) {
			System.out.println("The Canditate eligible for Vote");
		} else {
			System.out.println("The Canditate not eligible for Vote");
		}

		String gra = ar.grademark(99);
		System.out.println(gra);

		int facto = ar.factorial(0);
		System.out.println(facto);
	}

//	1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

	public int add(int a, int b) {
		int c = a + b;
//		System.out.println(c);
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		return c;
	}

//	2. Define a method that returns the product of two double numbers entered by user.

	public double doubmul(double a, double b) {
		double c = a * b;
		return c;
	}

//	Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 

	public float circleCircum(float r) {
		float f = (float) (2 * Math.PI * r);
		return f;
	}

	public double circlearea(double r) {
		double a = Math.PI * r * r;
		return a;

	}

//	. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

	public int max(int a, int b, int c) {
		int max = a;
		if (b > a) {
			max = b;
		}
		if (c > a) {
			max = c;
		}
		return max;

	}

	public int min(int a, int b, int c) {
		int min = a;
		if (a > b) {
			min = b;
		}
		if (a > c) {
			min = c;
		}
		return min;
	}

//	Def﻿ine a program to find out whether a given number is even or odd - return true/false.

	public boolean evenOdd(int a) {

		int b = a % 2;
		if (b == 0) {
			return true;
		} else {
			return false;
		}

	}

//	A person is eligible to vote if his/her age is greater than or equal to 18.
//
//	 Define a method to find out if he/she is eligible to﻿ vote. - return true/false

	public boolean voteage(int a) {
		System.out.println("The Canditate Age is " + a);
		if (a >= 18) {
			return true;
		} else {
			return false;
		}
	}

//	Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//		Marks        Grade
//		91-100         AA
//		81-90          AB
//		71-80          BB﻿
//		61-70          BC
//		51-60          CD
//		41-50          DD
//		<=40          Fail

	public String grademark(int i) {
		String sr1 = "";
		if (i >= 91 && i <= 100) {
			sr1 = "AA";
		} else if (i >= 81 && i <= 90) {
			sr1 = "AB";
		} else if (i >= 71 && i <= 80) {
			sr1 = "BB";
		} else if (i >= 61 && i <= 70) {
			return "BC";
		} else if (i >= 51 && i <= 60) {
			return "CD";
		} else if (i >= 41 && i <= 50) {
			return "DD";
		} else {
			return "Fail";
		}
		// System.out.println(sr1);
		return sr1;
	}

//	Write a program to print the factorial of a number by defining a method named 'Factorial'.
//	Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 1

	public int factorial(int i) {

		int re = 1;
		int fact = 1;
//		for(re=1; re<=i; re++) {
//			fact = fact*re; 
//		}
		for (re = i; re >= 1; re--) {
			fact = fact * re;
		}

		return fact;
	}

}
