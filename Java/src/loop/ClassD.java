package loop;

public class ClassD {

	public static void main(String[] args) {
		// Break & continue
		
		for(int i=0;i<5;i++) {
			if(i==2)
			continue;  // it will not print 2 and then continues
			System.out.println(i);
		}
		

	}

}


/*
Break & Continue:
1. They generally used with IF condition
Continue - > if Continue statement satisfies then it will not execute that perticular statement and then continue with next statement.
example output for above program: 0 1 2 4 .
So continue is used to skip the perticular loop.

Break - > Once the condition is satisfies then it come out of the loop.
example output for above program: 0 1 2
So break is used to break the loop.

*/