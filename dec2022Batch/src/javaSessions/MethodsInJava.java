package javaSessions;

public class MethodsInJava {

	//can not create a method inside a method and so we cannot create a method inside a main method
	
	//1. no input and no return
	//void -> this method does not return any value
	public void test() {
	System.out.println("test method");
		
	}
	
	//2. no input but some return
	public int getMarks() {
		System.out.println("Get Marks");
		int total =100;
		int bonus=200;
		int totalMarks=total+bonus;
		return totalMarks; 
	}
	
	
	public String getName() {
		System.out.println("get name method");
		String s="vicky";
		return s;
	}
	
	//3. some input and some return
	
	public int sum(int a,int b) {
		System.out.println("sum method");
		int z=a+b;
		return z;
	}
	
	public static void main(String[] args) {
			
		MethodsInJava a=new MethodsInJava();
		a.test();
	     int p=	a.getMarks();
		String q=a.getName();
		System.out.println(p);
		System.out.println(q);
		
		int sum=a.sum(5, 5);
		System.out.println(sum);
		
	}

}
