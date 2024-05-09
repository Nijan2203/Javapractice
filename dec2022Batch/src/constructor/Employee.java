package constructor;

public class Employee {

	String name;
	int age;
	String dob;
	String city;
	boolean isPermanent;
	
	
	//constructor
	//name of the constructor will remain same as class name
	// advantage->
	
	public Employee() {
		System.out.println("default const...");
	}
	
	public Employee(String name) {
		System.out.println("1 param const..."+name);
	}
	public Employee(int a,String b) {
		System.out.println("2 param const..."+a+b);
	}
	
	
	
	public static void main(String a[]) {
		
		Employee ob=new Employee();
		Employee ob1=new Employee("jha");
		Employee ob2=new Employee(10,"vicky");		
		System.out.println(ob1.name); // it will gv "null" but refer the "Example1" class program for more update
		
		
	}
	
	
}
