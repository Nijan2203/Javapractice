package encapsulation;

public class ZEmployee {

	
	public String name;
	public int age;
	private int salary;
	private String address;
	
	// public getter and setter
	// also shortcut is  rightClick > source > generate getter & setter
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	
}
