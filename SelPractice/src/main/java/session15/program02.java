package session15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
	
		//2.authentication popup
		WebDriver driver=new ChromeDriver();

	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		/*
		 in the above,
		 admin:amin is the username & pwd
		 url is "https://the-internet.herokuapp.com/basic_auth"
		 
		 so here the limitation is if pwd is "admin@123 then we cannot us it 
		 so always hv a practise to not use "@" as a pwd for authentication popup
		 */
		
		//best practise
		String username="admin";
		String password="admin";
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}

}
