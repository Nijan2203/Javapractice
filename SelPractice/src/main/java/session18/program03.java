package session18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {

	public static void main(String[] args) {
		// get the entered text in the input field
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement ele=driver.findElement(By.id("input-firstname"));
		ele.sendKeys("vicky");
		
		String value=ele.getAttribute("value");
		System.out.println(value);
		
		
		WebElement ele1=driver.findElement(By.id("input-firstname"));
		ele.sendKeys(null);
		//note: this wil gv illegalArgumentException
		
	}

}
