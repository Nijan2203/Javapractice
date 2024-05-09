package Exception;

public class tryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
		int i=9/0;
		}catch(Exception e) { // we can also write "Throwable" instead of Exception
			System.out.println("Some exception");
			e.printStackTrace(); // throw exception details. its a good practise
		}
		
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

}
