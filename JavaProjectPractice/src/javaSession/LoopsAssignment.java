package javaSession;

public class LoopsAssignment {

	public static void main(String[] args) {
		// WAP to print following output:
		// I am Batman﻿
		// I am Batman﻿
		// I am Batman﻿
		// I am Batman
		// I am Batman

		for (int i = 0; i <= 4; i++) {
			System.out.println("I am Batman");
		}

		System.out.println("----------------------------");

//		WAP to print following output:
//			I am Batman 1
//			I am Batman 2
//			I am Batman 3
//			I am Batman 4
//			I am Batman 5
//			I am Batman 6
//			I am Batman 7
//			I am Batman 8
//			I am Batman 9
		int i = 1;
		while (i <= 9) {
			System.out.println("I am Batman " + i);
			i++;
		}

//		 WAP to print 10 to 1 using for, while and do-while loop

//		for loop
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}
		System.out.println("----------------------------");
//		while loop
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		System.out.println("----------------------------");
//		do while loop
		int k = 10;
		do {
			System.out.println(k);
			k--;
		} while (k >= 1);

//		4. Write a program in Java to print "Hello World" ten times using while loop

		int h = 1;
		while (h <= 10) {
			System.out.println("Hello World");
			h++;
		}

//		Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop

		// for loop
		for (int j1 = 1; j1 <= 100; j1++) {
			int mul = j1 * 5;
			System.out.println(mul);
		}
		System.out.println("----------------------------");

		// while
		int a = 1;
		while (a <= 100) {
			System.out.println(a * 5);
			a++;
		}
		System.out.println("----------------------------");
		// do while
		int a1 = 1;
		do {
			int a2 = a1 * 5;
			System.out.println(a2);
			a1++;
		} while (a1 <= 100);

//		6. Print all odd and even numbers between 1 to 100

		for (int ie = 1; ie <= 100; ie++) {
			if (ie % 2 == 0) {
				System.out.println(ie + " Is the Even number");
			} else {
				System.out.println(ie + " is the odd number");
			}
		}

//		7. What will be the output of this program:\\\\\\\\\\\\\\Hi Java -----> infinite loop 
//
//			int iq = 1;
//
//			while(iq<=1){
//
//			System.out.println("Hi Java");
//
//			}

//		Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

		for (char ia = 'a'; ia <= 'z'; ia++) {

//			int iw=ia+0;
//			System.out.println(iw);
			System.out.println(ia + " ASCII value is " + (int) ia);
		}

		char cd = 'A';
		while (cd <= 'Z') {
			System.out.println(cd + " ASCII value is " + (int) cd);
			cd++;
		}

		char cc = '0';

		do {
			System.out.println(cc + " ASCII value is " + (int) cc);
			cc++;
		} while (cc <= '9');

//		Print the following series: 
//
//		1.0 2.0 3.0  ...... 10.0 
//
//		0 9 18 27 36 …99

		for (double wi = 1.0; wi <= 10.0; wi++) {
			System.out.print(wi + " ");
		}
		System.out.println();

		int aq = 0;
		while (aq <= 11) {
			System.out.print(aq * 9 + " ");
			aq++;
		}
		System.out.println();

//		Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.

		for (char ce = 'a'; ce <= 'z'; ce++) {
			while (ce == 'a') {
				System.out.print(ce);
				ce++;
			}
			while (ce == 'e') {
				System.out.print(ce);
				ce++;
			}
			while (ce == 'i') {
				System.out.print(ce);
				ce++;
			}
			while (ce == 'o') {
				System.out.print(ce);
				ce++;
			}
			while (ce == 'u') {
				System.out.print(ce);
				ce++;
			}

		}
		System.out.println("--------------------------------------");

//		Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for (int iz = 1; iz <= 100; iz++) {
			System.out.print(iz + " ");
			if (iz % 7 == 0) {
				// System.out.println();
				System.out.println(iz + " : Bye, See you Tomorrow");
				break;
			}
		}

	}

}
