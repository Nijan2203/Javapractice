package DoJo.ConstructorAndEncapsulation;

public class publicConstructorcall {
	
	int tax;
	String emp;
	String taxtype;
	String assyear;
	

	public publicConstructorcall(int tax) {
		this.tax = tax;

	}

	public publicConstructorcall(int tax, String emp) {

	}

	public publicConstructorcall(String taxtype, String Assyear) {
		this.taxtype=taxtype;
		this.assyear = Assyear;
	}

}
