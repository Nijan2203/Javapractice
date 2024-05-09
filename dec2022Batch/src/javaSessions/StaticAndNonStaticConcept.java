package javaSessions;

public class StaticAndNonStaticConcept {

	String name;
	static int age;
	
	public void getName() {
		System.out.println("get name");
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}
	public static void main(String[] args) {
	
		//access non static var & methods
		StaticAndNonStaticConcept s= new StaticAndNonStaticConcept();
	String a=	s.name="vicky";
		System.out.println(a);
		s.getName();
		
		// access static var & meth
		
		//1. call directly
		age=25;
		System.out.println(age);
		getInfo();
		
		//2. call using callname
		StaticAndNonStaticConcept.age=50;
		StaticAndNonStaticConcept.getInfo();
		
		//3. using object but will show warning
		s.age=40;
		
		s.getInfo();
	}

}
