package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EcommApp shop=new EcommApp();
		shop.login("suraj@gmail","vicky123").doSearch("mac", 5000)
		.addToCart("macbook")
		.doPayment("HDFC", "test")
		.getEmail()
		.logout()
		.login()
		.doSearch("Nike shoe")
		.addToCart("Nike shoe")
		.doPayment("GPAY", "TEST123")
		.logout();
		
		
		
		
	}

}
