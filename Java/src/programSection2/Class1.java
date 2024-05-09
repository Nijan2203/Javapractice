package programSection2;

public class Class1 {

	public static void main(String[] args) {
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
