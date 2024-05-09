package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,50,40,15,20};
		int max=20;
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max)
				l.add(arr[i]);
		}
	
		l.forEach(x -> System.out.println(x));
	}

}
