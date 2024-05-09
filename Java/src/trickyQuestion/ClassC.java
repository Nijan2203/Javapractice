package trickyQuestion;

public class ClassC {

	public static void main(String[] args) {
		
		//Infinity
		System.out.println(9.0/0);
		System.out.println(12.5f/0);
		System.out.println(5.6d/0);
		
		//NaN
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
		
		
		//Arithmetic exception - any integer divided by 0
		System.out.println(5/0);
		

	}

}
