package Basics;

public class ClassD {

	public static void main(String[] args) {
		// Wrapper class sample program
				Integer x1=400;
				Integer x2=400;
				
				if(x1==x2)
				System.out.println("same");
				else
					System.out.println("not same");
				
				
				int a=400;
				int b=400;
				if(a==b)
					System.out.println("same");
				else
					System.out.println("not same");
				
			}

		}
		/*
		The output is "not same" because x1 & x2 creates two different object and we cannot compare values in two different objects
		Here a & b are the references in the same object and so the output is "same".

		*/