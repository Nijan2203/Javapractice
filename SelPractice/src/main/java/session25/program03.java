package session25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {
	static WebDriver driver;
	
	public static void main(String[] args) {

		// selecting day from the current month - 2nd approach		
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		listOfDays("23");
	}

	public static void listOfDays(String day) {
		List<WebElement> daysList=driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		
		for(WebElement e:daysList) {
			String days=e.getText();
			if(days.equals(day)) {
				e.click();
			}
		}
	}
	
}


//program02 method is faster and best approach