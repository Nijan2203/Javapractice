package programSection2;

import java.util.ArrayList;

public class Class4 {

	public static void main(String[] args) {
		// compare same index of two different array and create a new array of match
		
		int a[]= {1,4,5,7};
			int b[]= {6,4,3,7};
			ArrayList<Integer> al= new ArrayList<Integer>();
			
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					// code to create array
					// use arrayList bcoz size may be dynamic
					
					al.add(a[i]);
				}
			}
			// convert arrayList to array
			Object c[]=al.toArray();
			System.out.println(c); // we cannot print result directly , so go for loop
			for(Object ob:c) {
				System.out.println(ob);
			}

	}

}
