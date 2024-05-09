package Encapsulation;

public class Person {

//	Objective: The objective of this assignment is to create a class that uses encapsulation to protect its data and provide getter and setter methods for accessing the data.
//	Instructions:
//	Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).
//	Create getter and setter methods for each attribute.
//	Write a method called "printInfo" that prints out the name, age, and gender of the person.
//	Create an instance of the "Person" class and set its attributes using the setter methods.
//	Call the "printInfo" method to verify that the data was set correctly.
//	Questions:
//	What is encapsulation and how does it relate to object-oriented programming?
//	whenever the the user call method access the private method via the public method which called to encapsulation. 
//	bundling of parameters and methods. data hiding,Access control,Information Hiding, Modularity, Seucrity and integrity
//	Why is it important to use getter and setter methods instead of accessing attributes directly?
//	promotes encapsulation, controlled access to data, and the ability to modify the internal implementation without affecting external code. It contributes to the overall robustness, maintainability, and adaptability of object-oriented code.
//	How can encapsulation improve the security and reliability of a program?
//	encapsulation enhances the security and reliability of a program by providing a mechanism for hiding implementation details, controlling access to data, maintaining a consistent state, and facilitating adaptability to changes. It promotes good design practices that contribute to building robust and secure software systems.
//	What is the difference between a private attribute and a public attribute?
//	public attribute can be called from the out side of the class but private attributes not able to called from the outside of the class
//	How does encapsulation help with code maintainability and scalability?
//	In summary, encapsulation improves code maintainability and scalability by promoting modularity, abstraction, reduced code complexity, flexibility to change internal implementations, controlled access to data, code reusability, improved testing practices, and enhanced collaboration. These principles are essential for building and maintaining large and complex software systems over time.

	private String name;
	private int age;
	private String gender;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		System.out.println("Person name : " + getname());
		System.out.println("Person age : " + getAge());
		System.out.println("Person gender : " + getGender());
	}

	public static void main(String[] a) {
		Person hum = new Person();
		hum.setname("Nijanthan Thangavel");
		hum.setGender("Male");
		hum.setAge(28);
		hum.printInfo();
	}

}
