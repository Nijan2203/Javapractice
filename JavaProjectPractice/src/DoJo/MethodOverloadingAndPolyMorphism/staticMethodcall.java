package DoJo.MethodOverloadingAndPolyMorphism;

public class staticMethodcall {

	static int Bankname=5948654;
	
	public static void login() {
		System.out.println("Login the method without username and tokenid");
		publicMethodcall publicmethod = new publicMethodcall();
		publicmethod.searchBankAccount(publicMethodcall.name,"6846841468454854");

	}

	public static void login(String name) {
		System.out.println("Login the method with username alone");
	}

	public static void login(int tokenid) {
		System.out.println("Login the Method with tokenid alone "+tokenid);
		staticMethodcall.login("nijanthan");
	
		
		
	}
}
