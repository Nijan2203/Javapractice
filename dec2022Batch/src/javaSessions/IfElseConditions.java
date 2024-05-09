package javaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		
		int a=100;
		int b=100;
		
		if(a>b) {
			System.out.println("a is greater");
		}else
		{
			System.out.println("b is greater");
		}
		if(a==b) {
			System.out.println("equal");
		}
		
		//dead code
		if(true) {
			System.out.println("always true");
		}
		else {
			System.out.println("bye");
		}

		boolean flag=true;
		if(flag) {
			System.out.println("always true");
		}
		else {
			System.out.println("bye");
		}
		
		int number=200;
		if(number <=100) {
			if(number >=90) {
				System.out.println("GRADE A");
			}
			if(number <=75) {
				System.out.println("GRADE B");
			}
			else {
				System.out.println("invalid number");
			}
			
			
		}
		String s1="Selenium";
		String s2="selenium";
		if(s1.equals(s2))
			System.out.println("both equal");
			else
				System.out.println("not equal");
			
	if(s1.equalsIgnoreCase(s2))
	System.out.println("both equal");
		else 
		System.out.println(" not equal");
	
	String browser ="firefox";
	if(browser.equals("chrome")) {
		System.out.println("launch chrome");
	}
	else if(browser.equals("firefox")) {
		System.out.println("launch firefox");
	}
	else if(browser.equals("safari")) {
		System.out.println("launch safari");
	}
	else {
		System.out.println("plz pass the right browser");
	}
	}	

}
