package session19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program01 {

	public static void main(String[] args) throws InterruptedException {
		//action class
// Handling header elments		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		
		WebElement menu=driver.findElement(By.xpath("//button[text()='Developers']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(menu).build().perform();  // always use "build" "perform" wenever we use action class
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Support")).click();
		driver.close();
		
	}

}
