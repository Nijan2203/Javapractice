package functions;

public class ClassB {

	public static void main(String[] args) {
		// calling non-static functions
		
		System.out.println("Before function");
		ClassB b=new ClassB();  // creating object to call non-static function
		b.func();
		System.out.println("After function");
	}

	public void func() {
		System.out.println("Inside function");
	}
}
