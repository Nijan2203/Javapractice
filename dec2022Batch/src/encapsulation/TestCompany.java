package encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c=new Company();
		c.name="ABC";
		c.empCount=600;
		// i cannot access sharePrice & totalSharePrice in another class

	}

}
