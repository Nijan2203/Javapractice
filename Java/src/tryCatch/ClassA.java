package tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Below statement may throw a FileNotFoundException

			Scanner in=new Scanner(new File("test.in"));
			// if everything goes well, below statement would be executed
			// if an exception is occured in previous statement,
			// below statement would not be executed
			System.out.println("Exit main");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found caught...");
		}
		// option
		// always run regardless of exception status
		finally {
			System.out.println("Finally block runs regardless of the state of exception");
		}
		// optional
		// after the try-catch-finally
		// will not be executed in case of an uncaught exception
		System.out.println("After try-catch-finally, life goes on...");

		
	}

}
/*		
// exception keywords are -> try, catch, finally, throw, throws

try {
	// write code that might throw exception
}
catch(Type1 e1)
{
	// code to handle the type1 exception
}
catch(Type2 e2)
{
	// code to handle the type2 exception
}
finally
{
	// code that is always executed whether exception is thrown or not
}

}
*/