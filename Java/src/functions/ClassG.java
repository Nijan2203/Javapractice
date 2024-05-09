package functions;

public class ClassG {
	static int a = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	main(); //calling main method
	ClassG c=new ClassG(); // object creation is enough for "constructor"
	
	c.getdata(); // calling non-static method
	getMethod(); //calling static method
	ClassD.add(5, 5); // calling static method from other class
	System.out.println(a); // calling static variable of same class directly
	ClassB b= new ClassB(); // calling non static method from other class
	b.func();
	}

//overloading main method
	public static void main() {
		System.out.println("main method");
	}
	
//constructor
	
	public  ClassG() {
		System.out.println("constructor");
	}

//non static method
	
	public void getdata() {
		System.out.println("non static method");
	}

//static method
	
	public static void getMethod() {
		System.out.println("Static method");
	}
}
