package functions;

public class ClassC {

	public static void main(String[] args) {
		// calling function in function
		funct1();

	}

	public static void funct1() {
		
		System.out.println("Funct1 begins");
		funct2();
		System.out.println("Funct1 ends");
		
	}
	
	public static void funct2() {
		System.out.println("funct2 begins & ends");
	}
}
