package arrays;

public class ClassP {

	public static void main(String[] args) {
		// Find duplicate element in an array
		
		int a[]= {55,1,2,1,65,2,89,74,89};
		int b[]= {5,2,36,5,65,89,5,6,4};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}
	}

}
