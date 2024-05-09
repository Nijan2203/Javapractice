package javaSessions;

public class ClassAndObject {

	//class variables
	String name;
	int age;
	double salary;
	boolean isActive;
	String username="vicky";
	public static void main(String[] args) {
		
		// create object of this class
		// new keyword
		
		ClassAndObject e=new ClassAndObject(); // "e" is the object reference and "new ClassAndObject()" is the object
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.isActive); // default value of boolean is False
		
		e.name="vicky";
		e.age=29;
		e.salary=50000;
		e.isActive=true;
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.isActive); 
		System.out.println(e.username);
		
	}

}
