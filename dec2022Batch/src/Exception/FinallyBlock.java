package Exception;



public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		try {
			int i=9/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Exception is here,....");
		}
		finally {
			System.out.println("Bye....");
		}
		
	}

}
