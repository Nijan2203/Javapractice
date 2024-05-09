package Encapsulation;

public class BankAccount {

//	Objective: The objective of this assignment is to create a class that uses encapsulation to hide its implementation details and provide a simple interface for clients.
//	Instructions:
//	Create a class called "BankAccount" with the following private attributes: accountNumber (String), balance (double), and owner (String).
//	Create getter and setter methods for each attribute.
//	Write a method called "deposit" that takes a double parameter and adds it to the balance.
//	Write a method called "withdraw" that takes a double parameter and subtracts it from the balance.
//	Write a method called "printStatement" that prints out the account number, owner name, and balance.
//	Create an instance of the "BankAccount" class and set its attributes using the setter methods.
//	Call the "deposit" and "withdraw" methods to modify the balance of the account.
//	Call the "printStatement" method to verify that the data was set correctly.
//	Questions:
//	How can encapsulation be used to hide implementation details from user of a class?
// 	it can be implemented the way it can't affect the user behavior with the separate inner logic implementation
//	What are the benefits of using private attributes in a class?
//	it can be restrict the users to avoid the attributes unnessary updation from outside of the class.
//	In summary, using private attributes in a class supports the principles of encapsulation, controlled access, and data integrity. It enhances the security, maintainability, and readability of the code, making it easier to manage and understand.
//	What is the difference between a getter method and a setter method?
//	getter will declare the data to the class vairable and return it to the corresponding class call from class instance
//	Setter will set the value or update the value of the class variable and it will also have some inner validation logic if needed
//	How can encapsulation improve the readability of code?
//	In summary, encapsulation promotes code readability by providing a structured, abstracted, and well-defined approach to organizing and interacting with data and behavior in an object-oriented program. This practice simplifies the mental model required to understand the code, making it more accessible and maintainable for developers.

	private String accountNumber;
	private double balance;
	private String owner;

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.setaccountNumber("3246845164846516844");
		acc.setBalance(21645.51);
		acc.setOwner("Nijanthan Thangavel");
		acc.printStatement();
		System.out.println("-------------------After Withdraw----------------------");
		acc.withdraw(8425.51);
		System.out.println("withdraw amount 8425.51");
		acc.printStatement();
		System.out.println("-------------------After deposit----------------------");
		acc.deposit(6845.99);
		System.out.println("deposit amount 6845.99");
		acc.printStatement();
	}

	public void deposit(double deposit) {
		double Newbalance = balance + deposit;
		this.balance = Newbalance;
	}

	public void withdraw(double withdraw) {
		double afterwithdraw = balance - withdraw;
		this.balance = afterwithdraw;
	}

	public void printStatement() {
		System.out.println("AccountNumber: " + getaccountNumber());
		System.out.println("Owner Name:" + getOwner());
		System.out.println("Current Balance: " + getBalance());

	}

}
