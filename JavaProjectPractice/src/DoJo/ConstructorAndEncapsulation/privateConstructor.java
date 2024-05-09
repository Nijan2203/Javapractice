package DoJo.ConstructorAndEncapsulation;

public class privateConstructor {

	int  taxamount;
	String company;
	String Branch = "Chennai";

	private privateConstructor(int taxAmount) {
		this.taxamount = taxAmount;
	}

	private privateConstructor(int TaxAmount, String Company) {
		this.taxamount = TaxAmount;
		this.company = Company;
	}

	private privateConstructor(String Branch) {
		this.Branch = Branch;
	}

	public  static void test() {
		privateConstructor pc = new privateConstructor(50000);
		System.out.println(pc.taxamount);
	}
	
}
