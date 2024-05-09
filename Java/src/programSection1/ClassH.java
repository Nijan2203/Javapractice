package programSection1;

import java.util.Scanner;

public class ClassH {

	public static void main(String[] args) {
		// count digits
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
		
		while(n>0) {
			n=n/10;
			count=count+1;
		}
System.out.println(count);
	}

}
