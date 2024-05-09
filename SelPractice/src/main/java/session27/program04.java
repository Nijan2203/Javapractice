package session27;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program04 {

	public static void main(String[] args) throws InterruptedException {
//scroll up & down	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		

	}

}
