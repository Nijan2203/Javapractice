package Abstract;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage lp =new LoginPage();
		lp.header();
		lp.title();
		lp.loading();
		lp.url();
		lp.doLogin("admin" ,"admin");
		lp.logo(); // or use below method to call logo
		Page.logo();
		
	// top casting
		// child class object can be referred by parent class ref variable
		
		Page p=new LoginPage();
		p.title();
		p.header();
		p.url();
		p.loading();
		// doLogin cannot be called
		p.logo();
		Page.logo();
		
	// downcasting
		// LoginPage p1=new Page(); not allowed
		
		
		
		
	}

}
