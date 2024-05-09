package programSection2;

public class Class2 {

	public static void main(String[] args) {
		// print multiplication table without using multiply operator
		
		int result=multiply(5,10);
		System.out.println(result);

	}

	private static int multiply(int i, int j) {
		
		int sum=0;
		for(int k=1;k<=j;k++) {
			
			sum=sum+i;
			
		}
		return sum;
	}

}
