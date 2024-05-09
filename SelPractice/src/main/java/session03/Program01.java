package session03;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Program01 {

	public static void main(String[] args) {
		
		//SID -session id
		WebDriver driver=new ChromeDriver(); // example:sid=123
		driver.get("https://www.google.com/"); // sid=123
		String title=driver.getTitle(); // sid=123
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl()); // sid=123
		driver.quit(); // sid=123\
		
		System.out.println(driver.getTitle());
		//org.openqa.selenium.NoSuchSessionException: Session ID is null.
		
		driver.close(); // sid=123
		System.out.println(driver.getTitle());
		//org.openqa.selenium.NoSuchSessionException: invalid session id
		
		driver = new ChromeDriver(); // sid=456
		System.out.println(driver.getTitle()); // sid=456

	}

}
/*

close- close the current window. session is maintained .invalid session id
quit - close all the window.- session is not maintained. Session ID is null

Definition:
quit closed all the window and further if driver method is called(ex:getTitle from above example) then it throws an exception session ID is null 

*/