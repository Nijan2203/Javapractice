package javaSession;

public class CallByValueCallByRef {

	// Call by value
	public int test(int a, int b) {
		int c = a + b;
		return c;
	}

//	Call by reference 
	// class veriable
	String name;
	int age;

	public void test(CallByValueCallByRef re) {
		re.name = "Nijanthan";
		re.age = 50;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueCallByRef ob = new CallByValueCallByRef();
		int result = ob.test(58, 54); // callby value
		System.out.println(result);

		ob.test(ob);// call by reference
		System.out.println(ob.name + " " + ob.age);

		ob.name = "Pavi";
		System.out.println(ob.name + " " + ob.age);
		ob.test(ob);
		System.out.println(ob.name + " " + ob.age);
	}

}
