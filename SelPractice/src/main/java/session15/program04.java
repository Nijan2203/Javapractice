package session15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program04 {

	public static void main(String[] args) {
		// frame handle
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www/londonfreelance.org/courses/frames.index.html");
		
		driver.switchTo().frame(2); //index is risky do not use it
		
		driver.switchTo().frame("main"); // here "main is the "name/id" attribute of frame
		
		driver.switchTo().frame("//frame[@src='top.html']");
		
		//always use 2nd or 3rd
		
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);

	}

}
