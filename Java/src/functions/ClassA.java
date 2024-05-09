package functions;

public class ClassA {

	public static void main(String[] args) {
		// calling static functions
		
		System.out.println("Before function");
		func();
		System.out.println("After function");

	}
	
	public static void func() {
		System.out.println("Inside function");
	}

}
