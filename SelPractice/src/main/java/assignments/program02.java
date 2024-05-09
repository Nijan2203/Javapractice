package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
		// find total count of inputs
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> inputList=driver.findElements(By.tagName("input"));
		System.out.println(inputList.size());
		driver.quit();
	}

}
