package session12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("username")).sendKeys("vickykumarm");
		driver.findElement(By.name("password")).sendKeys("Surajjha@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();   // in DOM we have "contacts" in small but in screen we hv it in capital letter. so we always need to consider the screen
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='suraj jha']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
