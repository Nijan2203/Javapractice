package programSection1;

public class ClassK {

	public static void main(String[] args) {
		//Fibonacci series
		
		int a=0;
		int b=1;
		int sum;
		
		int i=1;
		while(i<7) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}

	}

}
