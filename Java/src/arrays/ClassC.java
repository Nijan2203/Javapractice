package arrays;

public class ClassC {

	public static void main(String[] args) {
		// 2-D array
		
		int a[][]= {{5,8,4,2,6},{5,14,28,50,23}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		

	}

}
