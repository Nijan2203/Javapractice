package constructor;

public class Employee {

//	Create a Java class named "Employee" with the following instance variables:
//		id (int)
//		name (String)
//		salary (double)
//		Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.
//		Create getter methods for each of the instance variables.
//		Create a main method that creates an instance of the Employee class using the constructor, prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
//		Questions:
//		What is the purpose of a getter method in Java?
//		it will return the recent updated golable variable details of the class instance
//		Can a getter method return void?
//		No, if we use the void return then we can't able to access the return value so we can't
//		What is the access level of a getter method in Java?
//		Public,private
//		What is the purpose of a setter method in Java?
//		to update the global veriable value based on the business logic
//		Can a setter method return a value other than void?
//		Yes, it can but since we are using the setter method to update the golbal veriable it will not be return the other than void if any buniesss logic is requested

	private int id;
	private String name;
	private double Salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.Salary = salary;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public double getsalary() {
		return Salary;
	}

	public void setsalary(double sal) {
		this.Salary = sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(144, "Nijan", 100.5);
		System.out.println(emp.getname());

		double sala = emp.getsalary() + emp.getsalary() * 0.10;
		emp.setsalary(sala);
		System.out.println(emp.Salary);

	}

}
