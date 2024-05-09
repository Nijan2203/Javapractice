package session08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class program04 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// dropdown without select
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
	//	By countryDrop=By.id("Form_getForm_Country"); we cannot use this since it wil generate only 1 value
		By options=By.xpath("//select[@id='Form_getForm_Country']/option");
		List<WebElement> dropdown=driver.findElements(options);
		System.out.println(dropdown.size());
		
		for(WebElement e:dropdown) {
			String values=e.getText();
			System.out.println(values);
			if(values.equals("India")) {
				e.click();
				break;
			}
		}

	}

}
