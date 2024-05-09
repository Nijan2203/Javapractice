package Final;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=10;
		try {
		int div= p/0;
		}catch (ArithmeticException e) {
			System.out.println("AE is coming....");
		}
		finally {
			System.out.println("Fianlly block");
		}
		
		System.out.println("BYE!!");
	}
// finally block can be written only along with try block
	// without catch block also , finally can be written
}
