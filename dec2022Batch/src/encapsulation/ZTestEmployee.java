package encapsulation;

public class ZTestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZEmployee z=new ZEmployee();
		z.setSalary(100);
		z.getSalary();
		System.out.println(z.getSalary());
		
		z.setAddress("51.abc");
		System.out.println(z.getAddress());
		// here i can access the private variable - it is called encapsulation
	}

}
