package arrays;

public class ClassS {

	public static void main(String[] args) {
		// find common
		int[] a = { 1, 2, 3, 7, 5 };
		int[] b = { 3, 1, 7, 8, 9 };
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
