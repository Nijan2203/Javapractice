package session19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class program04 {

	public static void main(String[] args) {
		// clicks & sendkeys using Action class
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn=By.id("input-firstname"); 
		By ln=By.id("input-lastname");
		By subBtn=By.xpath("//input[@type='submit']");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(driver.findElement(fn), "vicky").build().perform();
		act.sendKeys(driver.findElement(ln), "jha").build().perform();
		act.click(driver.findElement(subBtn)).build().perform();
		

	}

}
