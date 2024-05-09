package assignmentMethodoverloading;

public class MathOperations {

	static double result;

	public static void add(int a, int b) {
		result = a + b;
	}

	public static void multiply(double a, double b) {
		result = a * b;
	}

	public static void displayResult() {
		System.out.println(result);
	}

	public static void displayResult(String name) {
		System.out.println(name + result);
	}

}
