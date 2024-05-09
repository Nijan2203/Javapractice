package Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("Login page constructor");
	}
	
	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("Login page title");
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		
		System.out.println("Login page URL");
	}

	@Override
	public void loading() {
		// TODO Auto-generated method stub
		
		System.out.println("Login page loading");
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("Login with:"+un +pwd);
		
	}
	
	public void doLogin(String un,String pwd,String emailID) {
		System.out.println("Login with:"+un +pwd + emailID);
	}
	
	//public static void logo() {
		//System.out.println("Page logo");
	//}
	
	
}
