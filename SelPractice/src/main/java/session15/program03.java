package session15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {

	public static void main(String[] args) {
		// file upload popup
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\vickykma\\Documents\\studies\\SDLC life cycle.PNG");

		/*
		  note:
		  the above sendkeys method wil work only if the 
		  //<tag type='file'>
		   
		   otherwise use sikuli,autoID,robot
		 sikuli,autoID,robot wil work only in windows so not recommended
		 so inform developer to use type=file 
		   
		 */
		
		
	}

}
