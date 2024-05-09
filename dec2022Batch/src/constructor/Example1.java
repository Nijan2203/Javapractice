package constructor;

public class Example1 {

	String name;
	int age;
	
	public Example1(String name) {
		this.name = name;
	}
	

	public Example1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public static void main(String a[]) {
		
		Example1 ob=new Example1("vicky");
		System.out.println(ob.name); 
	
		Example1 ob1=new Example1("vicky", 29);
		System.out.println(ob1.name+ob1.age); 

	
	}
}
