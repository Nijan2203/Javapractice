package tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			Scanner in=new Scanner(new File("test.in"));
			System.out.println("Exit main");
		}
		// hight exception should be placed in lower level
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException caught...");
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found caught...");
		}
		
		catch(Exception ex) {
			System.out.println("A new exception has occurred...");
		}
		
		
		finally {
			System.out.println("Finally block runs regardless of the state of exception");
		}

	}

}
