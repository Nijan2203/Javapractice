package constructor;

public class Car {

//		Create a Java class named "Car" with the following instance variables:
//		make (String)
//		model (String)
//		year (int)
//		Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//		Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
//		Create a main method that creates three instances of the Car class using both constructors and prints out their information.
//		Questions:
//		What is the purpose of a default constructor in Java?
//		it will allow the obj creation without the argument
//		Can a default constructor take in parameters?
//		Yes, custructor can take parameter but if it takes the parameter then it not called as default constructor
//		Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?
//		yes it can overloaded in java, it will allow the fecabliity to create a verious obj creation with different param argument pattern
//		Can you create an object of a Java class without calling a constructor?
//		No we can't, Even without constructor is implemented in logic then java will create the default constrctor in backend 
//		How are instance variables accessed and modified outside of the class they are defined in?
//		by the help of getter and setter methods(encapulation priciple)

	String make;
	String model;
	int year;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;

	}

	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";
	}

	public String getmake() {
		return make;
	}

	public String getmodel() {
		return model;
	}

	public int getyear() {
		return year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		System.out.println(car1.getmake() + " " + car1.getmodel() + " " + car1.getyear());
		Car car2 = new Car("BMW", "S6", 2024);
		System.out.println(car2.getmake() + " " + car2.getmodel() + " " + car2.getyear());
	}

}
