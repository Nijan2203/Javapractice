package constructor;

public class Rectangle {
	
//		Create a Java class named "Rectangle" with the following instance variables:
//		length (double)
//		width (double)
//		Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
//		Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.
//		Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
//		Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.
//		Questions:
//		What is the purpose of a default constructor in Java?
//		it will allocate the memory to run the logic during the run time with help of obj 
//		How can you differentiate between a default constructor and a constructor that takes in parameters?
//		with the parameter which passed as argument. default constructor the parameters not availblae 
//		What is the access level of a constructor in Java?
//		access modifiers - public, protected, private and default(within class)
//		Can a constructor be private? If so, why would you want to make a constructor private?
//		Yes, it can be .So that you have control over how instances of the class are created, 
//		Can a constructor call a method from another class?
//		Yes, a constructor in Java can call a method from another class, just like any other method can call methods from different classes.
		
	double length;
	double width;
	
	public Rectangle() {
		this.length=0.0;
		this.width=0.0;		
	}
	
	public Rectangle(double Length, double Width) {
		this.length = Length;
		this.width = Width;
		
	}
	
	
	public double calculateArea() {
		double c = length*width;
		return c;
	}
	

	public static void main(String[] args) {
		
		
		Rectangle area1 = new Rectangle();
		System.out.println(area1.calculateArea());
		Rectangle area2 = new Rectangle(5.4, 9.5);
		System.out.println(area2.calculateArea());
		
		

	}

}
