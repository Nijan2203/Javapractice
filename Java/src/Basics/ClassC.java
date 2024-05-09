package Basics;

public class ClassC {

	public static void main(String[] args) {
		// Wrapper class, Auto boxing & unboking
		
				int x1=10;
				Integer x2=x1;  // auto-boking
				int x3=x2;  // auto-unboking
				
				System.out.println(x1);
				System.out.println(x2);
				System.out.println(x3);

				
			}

		}
		/*
		WRAPPER CLASS:

		1. All primitive dataType , we have wrapper class.
		EX: char -> Character, int -> Integer.

		2. If one variable storage is required then we can use example "int a=10" but we need to store list of integer values then we need to use Interger class(ex: Integer a=Interger(10) )

		3. primitive dataType create references and wrapper class creates object

		Auto-boking and Auto-unboking
		Auto-boking - Primitive type variable comes into wrapper class object . int becomes Integer
		Auto-unboking - wrapper class object comes to Primitive type variable

		*/