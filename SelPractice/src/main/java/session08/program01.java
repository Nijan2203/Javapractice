package session08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program01 {
	
	static WebDriver driver;

	public static void main(String[] args) {
	driver =new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	By countryDrop=By.id("Form_getForm_Country");
	// dropdown -> html tag -> select then use Select class
	
	WebElement country_ele=driver.findElement(countryDrop);
	Select select = new Select(country_ele);
	//select.selectByIndex(5);
	//select.selectByValue("Albania");
	select.selectByVisibleText("Benin");
	select.selectByVisibleText("Belize");
	//driver.quit();

	}

}
