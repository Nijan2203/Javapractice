package encapsulation;

public class Company {
	
	
	public String name;
	public int empCount;
	private int sharePrice;
	
	public String getCEOName() {
		return "TOM";
	}
	
	private int totalSharePrice() {
		return 1000;
	}

	public static void main(String[] args) {
		
		Company c=new Company();
		c.name="IBM";
		c.empCount=500;
		c.sharePrice=60;
		
		c.getCEOName();
		c.totalSharePrice();

	}

}
