package Basics;

public class ClassO {

	public static void main(String[] args) {
//Bitwise AND( binary representation of AND)
		
				int x=3;
				int y=6;
				System.out.println(x&y);
//Bitwise OR
				System.out.println(x|y);
				
//Bitwise NOT
				System.out.println(~x);

//Left shift operator(<<) = shift bits to left
				System.out.println(x<<1);

//Right shift operator(>>)
				System.out.println(x>>1);

//Unsigned right shift operator . Result are same for positive numbers
				System.out.println(x>>>1);				
	}

	
}
/*
Bitwise AND
x:  0....0 0 1 1
y:  0....0 1 1 0
x&y:0....0 0 1 0  = 2 

Left shift operator
x:   0....0 0 1 1
x<<1:0....0 1 1 0 = 6

*/