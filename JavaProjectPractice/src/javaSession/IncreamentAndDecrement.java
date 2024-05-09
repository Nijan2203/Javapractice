package javaSession;

public class IncreamentAndDecrement {

	public static void main(String[] args) {

//		What will be the output of the following program? 11+13 = 24
//		
//
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

//				Guess the output of the following program? 
		// a=11 a++ = 11 ++a = 13
		// b=22 b++ = 22 ++b=24
		// c = 11+22+11+22+13+24
		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

//				What will be the output of the below program?
//				j = 0 - 0 + 1 - 1
		int j = 0;
		j = j++ - --j + ++j - j--;
		System.out.println(j);// 0

//				 Is the below program written correctly?

//		boolean l = true;
		// l++;// This will be the problem here because boolean value doesn't convert
		// into a integer
//		System.out.println(b);

//				 		What will be the output of the below program?
		// m = 1 - 2 - 3
		int p = 1, o = 2, u = 3;

		int m = p-- - o-- - u--;
		System.out.println("i=" + p); // 0
		System.out.println("j=" + o);// 1
		System.out.println("k=" + u);// 2
		System.out.println("m=" + m);// -4

//				 			What will be the output of the following program?
//				 			
		int y = 1, t = 2;
		System.out.println(--t - ++y + ++t - --y);// 1 - 2 + 2- 1 =0

//				 			What will be the value of i, j and k in the below program?
//				 			nij =19 - 29 -0
		int r = 19, e = 29, w = 0;
		int nij = r-- - e-- - w--;
		System.out.println("i=" + r);// 18
		System.out.println("j=" + e);// 28
		System.out.println("k=" + w);// -1
		System.out.println(nij);// -10

//				 			What is wrong with the below program? Why it is showing compilation error?
//		int ll = 11;
		// int k = --(ll++);//syntex of the increment and decrement opertor is
		// wrong(Invalid operator)

//				 			Guess the value of p in the below program?
		// po = -1 * -1 *-1 *-1
		int h = 0, g = 0;
		int po = --h * --g * g-- * h--;
		System.out.println(po);// 1

//				 			What will be the output of the following program?
		// aj = 1 + 3 * 2 - 2
		int aj = 1;
		aj = aj++ + ++aj * --aj - aj--;
		System.out.println(aj); // 5

//				 			What will be the outcome of the below program?	

		// int an = 11++;
		// System.out.println(an);//compilation error(Invalid argument to operation
		// ++/--)

//				 			What will be the outcome of the below program?
		int ch = 'A';
		System.out.println(ch++); // '65'

//				 			What will be the outcome of the below program?
		char chd = 'A';
		System.out.println(++chd);// 'B'

//				 			What will be the outcome of the below program?

	}

}
