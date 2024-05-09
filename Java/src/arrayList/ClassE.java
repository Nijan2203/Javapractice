package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ClassE {

	public static void main(String[] args) {
		// List of smaller element
		int arr[]= {10,50,40,15,20};
		List<Integer> al=getSmaller(arr,30);
		for(Integer x:al)
			System.out.println(x);

	}
	
	public static List<Integer> getSmaller(int arr[],int k){
		
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<k)
				al.add(arr[i]);
		}
		
		return al;	
	}
	

}
