package arrays;

public class ClassU {

	public static void main(String[] args) {
		// count even & odd
		
		int[] a = { 1, 2, 3, 7, 5 ,10,14,19,22,21};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
				
			}
			else
				oddCount++;
			
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
