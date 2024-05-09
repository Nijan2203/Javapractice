package session03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browserName="chrome";
		String url="https://www.google.com/";
		
		browserUtil bu=new browserUtil();
		//bu.driver.getPageTitle();  -> here driver will be accessible and will b null and throws null pointer exception if we declare Public
		// if we make private then "drive" wont be accessible in "brUtil".
		bu.initDrivaer(browserName);
		bu.launchURL(url);
		bu.getTitle();
		bu.getPageURL();
		bu.closeBrowser();

	}

}
