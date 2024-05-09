package session27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program02 {

	public static void main(String[] args) {
		// using action class
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e=driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(e, Keys.SHIFT).sendKeys("vicky").build().perform();
		
	}

}
