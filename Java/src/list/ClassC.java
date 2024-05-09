package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()) {
			it.add(40);
			it.next();
			
		}
		System.out.println(list);
	}

}
