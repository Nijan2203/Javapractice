package programSection1;

public class ClassL {

	public static void main(String[] args) {
		// prime or not
		
		int value=7;
		boolean flag = false;
		for(int i=2;i<value;i++) {
			if(value%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) 
			System.out.println("It is not a prime number");
			else 
				System.out.println("It is prime number");
			
		}


	}

