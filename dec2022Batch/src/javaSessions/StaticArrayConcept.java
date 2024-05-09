package javaSessions;

public class StaticArrayConcept {

	public static void main(String[] args) {
// limitation of array :
		// 1. Size is fixed -> to overcome we can use dynamic array
		//2. stores same data type, to overcome we use object array(but still its static)
		// but we can use ArrayList<Object> - collectin
		//int array
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[0]);
		System.out.println(a[3]);
		int len=a.length;
		System.out.println("Length="+len);
		//to print all values in array
		
		for(int i=0;i<len;i++) {
			System.out.println(a[i]);
			
		// for each
			for(Integer e:a) {
				System.out.println(e);
			}
		
		// double array
		
			double d[]=new double[2];
			d[0]=12.33;
			d[1]=10.6;
		// character array
			char c[]=new char [3];
		// String array
			String s[]=new String[3];
			s[0]="vicky";
			s[1]="kumar";
			s[2]="jha";
			for(String z:s) {
				System.out.println(z);
			}
	Object ob[]=new Object[3];
	ob[0]="Vicky";
	ob[1]="29";
	ob[2]="7.6";
	for(Object e:ob) {
		System.out.println(e);
	}
			
		}
	}

}
