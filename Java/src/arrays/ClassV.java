package arrays;

public class ClassV {

	public static void main(String[] args) {
		// method which accepts array and retrun sum of all the elements
		
		int a[]= {1,2,3,4,5};
		
		int sum=summArray(a);
		System.out.println(sum);

	}

	private static int summArray(int[] a) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
	}
	

}
