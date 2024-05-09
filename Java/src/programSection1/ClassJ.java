package programSection1;

import java.util.Scanner;

public class ClassJ {

	public static void main(String[] args) {
		// factorial part-2

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(n>0) {
			i=i*n;
			n--;
		}
		System.out.println(i);

	}

}
