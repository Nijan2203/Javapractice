package switchStatement;

public class ClassA {

	public static void main(String[] args) {
		// switch
		int age=19;
		
		switch(age) {
		
		case 18:
			System.out.println("You can vote");
		break;
		case 45:
			System.out.println("You can become CM");
			break;
		case 60:
			System.out.println("You can be PM");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
