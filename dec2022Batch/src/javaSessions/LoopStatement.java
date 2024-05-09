package javaSessions;

public class LoopStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. while
		int i=0;
		while(i<=9) {
			System.out.println(i);
			i++;
		}
		
		
//2. for
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
//3. do while
		int p=1;
		do
		{
		System.out.println(p);
		p++;
		}
		while(p<=10); 
// print only odd
		for ( int odd=1;odd<10;odd=odd+2) {
			System.out.println(odd);
		}
// for loop with if condition.
		// 1 to 100.
		// when i find a number divisible by 5 then prin "Hii"
		
	for(int g=1;g<=100;g++) {
		System.out.println(g);
		if(g%5==0)
			System.out.println("Hii");
		
	}
	}
}
