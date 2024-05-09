package session18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program06 {

	public static void main(String[] args) throws InterruptedException {
		// StaleElementRefException
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement ele=driver.findElement(By.id("input-email"));
		ele.sendKeys("suraj@123");
		
		driver.navigate().refresh();
		ele.sendKeys("suraj@12345");
		
		

	}

}
/*
at line:16, a DOM is created . lets take example as version1.
the variable "ele" is for version1.
At line:21, when we refresh the browser, a new DOM is again created. So previous DOM becomes invalid(example version1 becomes invalid)
at line:22, "ele" is no more with version1 and so we get StaleElementRefException

HOW TO OVERCOME:
After "refresh" or before line:22, we need to declare WebElement again.
So "WebElement ele=driver.findElement(By.id("input-email"));" need to declare again with another variable for new DOM

Scenario: back,forward,refresh,click
*/