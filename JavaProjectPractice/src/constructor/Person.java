package constructor;

public class Person {

//	Create a Java class named "Person" with the following instance variables:
//	name (String)
//	age (int)
//	gender (char)
//	height (double)
//	Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//	Create a main method that creates two instances of the Person class using the constructor and prints out their information.
//	Questions:
//	What is the purpose of a constructor in Java?
//	It will limit the unneccessary obj creation
//	How does a constructor differ from a regular method in Java?
//	In regular method we can implement the business logic but in constructor we only insilize the global variable 
//	Can a Java class have multiple constructors? If so, how are they differentiated?
//	Yes, it will be differentiated by the passing veriable.
//	What happens if a constructor is not defined in a Java class?
// 	Default constructor will be created in backend of java and it will process the logic, And it may allow the unwanted obj creation 
//	Can a constructor call other methods or constructors within the same class?
//	Yes, we can call other methods and constructors this method is called constructor chaining or method chaining
//	it will avoid the duplication 
	
	String name;
	int age;
	char gender;
	double height;
	
	public Person(String Name, int Age, char Gender, double Height) {
		this.name = Name;
		this.age = Age;
		this.gender = Gender;  
		this.height = Height;
		
	}
	
	public Person(String Name, int Age) {
		this.name = Name;
		this.age = Age;
		
	}
	
	public  void test() {
		System.out.println("Hi");
	}
	
	
	
	public static void main(String[] args) {
		
		Person obj = new Person("Nijanthan Thangavel", 29);
		Person obj1 = new Person("Nija", 50);
		System.out.println(obj.name+obj.age+obj.gender+obj.height);
		System.out.println(obj1.name+obj1.age+obj1.gender+obj1.height);
		
		
		
		
		
		
		

	}

}
