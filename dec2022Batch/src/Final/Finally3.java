package Final;

public class Finally3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=10;
		try {
		int div= p/2;
		}catch (ArithmeticException e) {
			System.out.println("AE is coming....");
		}
		finally {
			System.out.println("Fianlly block");
		}
		
		System.out.println("BYE!!");
	}
	
	public int getMarks(String name) {
		
		if(name.equals("tom")) {
			return 100;
		}
		else if(name.equals("peter")) {
			return 90;
		}
		else {
			System.out.println("name not found");
			return -1;
		}
	}
	
	
	}


