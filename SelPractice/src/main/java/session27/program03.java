package session27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program03 {

	public static void main(String[] args) {
		
//copy paste 
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/account/about/");
		
		WebElement element=driver.findElement(By.xpath("/html/body/header/div[1]/div[5]/ul/li[1]/a"));
		element.click();
		
		WebElement fisrtName=driver.findElement(By.id("firstName"));
		WebElement lastname=driver.findElement(By.id("lastName"));
		
		fisrtName.sendKeys("vicky");
		
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		act.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		lastname.click();
		act.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		

	}

}
