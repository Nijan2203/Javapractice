package trickyQuestion;

public class ClassJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getData();
		getdata1();
	}
	
	static {
		System.out.println("static block");
	}
	public static void getData() {
		System.out.println("static method - 1");
		
	}
	public static void getdata1() {
		System.out.println("static method - 2");
		getData();
	}

}

/*
Q1: Diff b/w static block and static method
ans: Need to call explicitly for static method.

Q2: Is it possible to call static method inside static method.
ans: Yes. Refer line no:15
*/
