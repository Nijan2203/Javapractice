package functions;

public class ClassF {

	public static void main(String[] args) {
		// Function with return statement
		int a=10;
		int b=20;
		System.out.println(getMax(a,b));
	}

	public static int getMax(int a,int b) {  // here instead of void , we need to mention return data type
		if (a>b)
			return a;
		else
			return b;
	}
}
