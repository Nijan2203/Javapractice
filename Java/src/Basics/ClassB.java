package Basics;

public class ClassB {

	public static void main(String[] args) {
		// Primitive data types 
				// Literals -> a constant value asssigned to a variable is called literals.		
				
				Byte age=127; // -128 to 127 default value=0
				short age1=55; // 2 bytes, default value 0
				int age2=64; // 4 bytes, default value 0
				long views = 1000000000;// 8 bytes , default value 0
				float pi=3.14f; // 4 bytes, default value 0.0f
				double weight1=69.5d; // 8 bytes, 0.0d 
				char name='a'; // 
				boolean b=true; // default value false
				
				System.out.println(age);
				System.out.println(age1);
				System.out.println(age2);
				System.out.println(views);
				System.out.println(pi);
				System.out.println(weight1);
				System.out.println(name);
				System.out.println(b);

			}

		}
		/*
		Types of data type:
		1. Primitive (int, char, float,boolean,byte etc)
		2. Non primitive(String,Array etc)

		Primitive data types:
		a) boolean  (true or false)
		b) byte (-128 to 127)
		c) short (-32768 to 32767)
		d) int ( -2147483648 to 2147483647)
		e) long (-2^63 to 2^63-1)
		f) float (single precision 32 bit)
		g) double ( double precision 32 bit)
		h) char (16 bit unicode)

		Non primitive datatype:
		The data types which is created by classes is called non-primitive datatypes.

		Diff b/w:
		a) non primitive datatypes variables are always references.
		example program: swapping of two numbers

		b) non primitive datatypes allocates memory on Heap.
		ex: point p1=new point();

		c) non primitive datatype variables set default value.

		How to use variables names:
		- name, nameOfPlayer, currentYear.
		- we can write  constant values as upper case . 
		ex1: final int MAX_AGE=200;
		ex2: final int MAX_PLAYERS = 12; 
		- invalid names: should not start with  number and keyword cannot be used.
		ex: 11a, a#, a!, else, do.
		*/
