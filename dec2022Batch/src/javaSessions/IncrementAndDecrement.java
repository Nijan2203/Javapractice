package javaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// ++  increase the value by 1
		// -- decrease the value by 1
		
		//1. post increment: assign the value and then increase
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		int g=-99;
		int h=g++;
		System.out.println(g);
		System.out.println(h);
		
		//2. pre increment: increment the value and then assign it
		
		int c=1;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		
		int m=-97;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		//3. post decrement:
		int p=2;
		int q=p--;
		System.out.println(p);
		System.out.println(q);
		
		//4. pre decrement
		int u=2;
				int y=--u;
				System.out.println(u);
				System.out.println(y);
				
				int t1=2;
				System.out.println(t1++);
				System.out.println(t1);
		
	}

}
