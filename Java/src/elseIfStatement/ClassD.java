package elseIfStatement;

public class ClassD {

	public static void main(String[] args) {

		int number=4;
		
		if(number%2==0) {
			System.out.println("TWO");
		}
		else if(number%3==0) {
			System.out.println("THREE");
		}
		else if(number%11==0) {
			System.out.println("Eleven");
		}
		else
		{
			System.out.println("-1");
		}
	
		
		

	}

}
