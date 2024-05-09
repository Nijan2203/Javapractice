package session27;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program05 {

	public static void main(String[] args) {
		// refersh
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).perform();

	}

}
