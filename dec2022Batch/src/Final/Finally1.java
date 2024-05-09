package Final;

public class Finally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=10;
		try {
		int div= p/0;
		}catch (NullPointerException e) {
			System.out.println("AE is coming....");
		}
		finally {
			System.out.println("Fianlly block");
		}
		
		System.out.println("BYE!!");
	}
	}


