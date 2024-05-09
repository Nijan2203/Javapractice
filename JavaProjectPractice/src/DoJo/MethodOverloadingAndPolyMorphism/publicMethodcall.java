package DoJo.MethodOverloadingAndPolyMorphism;

public class publicMethodcall {
	
	
	static String name;
	 int deposti;
	
	public void searchBankAccount(String name, String acc) {
		publicMethodcall obj = new publicMethodcall();
		obj.SearchBankAccount(obj);//call by reference/obj reference
		System.out.println("BankAccount search with name and accout");
	}

	public void searchBankAccount(String acc) {

		System.out.println("BankAccout search with account Number");
		staticMethodcall.Bankname = 5464;
		staticMethodcall.login(staticMethodcall.Bankname);
		
		
	}

	public void SearchBankAccount(publicMethodcall ob) {
		this.deposti=684654984;
		System.out.println("BankAccount search with Deposit Amount "+deposti);
	
	}

}
