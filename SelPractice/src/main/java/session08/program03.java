package session08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program03 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
// select dropdown all elements
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By countryDrop=By.id("Form_getForm_Country");
		
		Select select=new Select(driver.findElement(countryDrop));
		List<WebElement> countriesList=select.getOptions();
		System.out.println(countriesList.size()-1);

// interview question: select the dropdown without using those 3 methods		
		for(WebElement e:countriesList) {
			String list=e.getText();
			System.out.println(list);
			if(list.equals("India")) {
				e.click();
				break;
			}
			
		}
		

	}

}
