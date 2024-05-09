package javaSessions;

public class DataTypes {

	public static void main(String[] args) {
		// data types - Java uses strict data types. ex we cannot use "String for data "10".
		
		//two types.
		// 1. Primitive data types - dont need any object
		   // 1. Boolean type : boolean(true/false)
		   //2. Numeric type:
			// 1. character type: char
			//2. Integral type:
				//1. Integer: byte, short,long,int
				//2. Floating-point: float, double
		
		
		
		
		// 2. Non primitive types -Need to create an object
			// String, Array, Interface, Classes
		
//1. byte
		// size: 1 byte =8 bits
		//range: -128 to 127
		byte b=10;
		b=20;
		byte b2=-127;
//2. short
		// size: 2 bytes = 16 bits
		//range: -32768 ~ 32767
		// example : if we want to declare value in kilometers
		
		short s1=1234;
//3. int
		// size: 5 bytes=32 bits
		//range: -2147483648 ~ 2147483674
		int i=23574;
		
//4. long
		//size: 8 bytes = 64 bits
		//example if we want to use population, no of covid cases, travel distance
		long l=989896565L;
//5. float
		//size: 4 bytes =32 bits
		//range: after . upto 7 decimal digits
		float f1=12.33f;
		float f2=(float)12.33;
//6. double
		//size: 8 bytes=64 bits
		//range: after . upto 16 decimal digits
		
		double d=34.556;
//7. char
		//single character
		char c1='a';
		char c2='1';
		//in java character is always a numeric value

		
		//size: 2 bytes = 16 bits
//8. boolean	true/false
		boolean flag=true;
		//size: around 1 bit
		
		
	}

}
